package com.niantic.controllers;

import com.niantic.models.Category;
import com.niantic.services.CategoryDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class CategoriesController
{
    CategoryDao categoryDao = new CategoryDao();

    // http://localhost:8080/categories
    @GetMapping("/categories")
    public String getAllCategories(Model model)
    {
        ArrayList<Category> categories;
        categories = categoryDao.getCategories();
        model.addAttribute("categories", categories);

        return "categories/index";
    }

    @GetMapping("/categories/{id}")
    public String getCategoriesById(Model model, @PathVariable int id)
    {
        var category = categoryDao.getCategoryById(id);
        model.addAttribute("category", category);

        return "categories/details";
    }

    @GetMapping("/categories/add")
    public String addCategory(Model model)
    {
        model.addAttribute("category", new Category());
        return "categories/add_edit";
    }

    @PostMapping("/categories/add")
    public String addCategory(Model model, @ModelAttribute("category") Category category)
    {
        categoryDao.addCategory(category);
        model.addAttribute("category", category);

        return "redirect:/categories";
    }

    @GetMapping("/categories/{id}/edit")
    public String editCategory(Model model, @PathVariable int id)
    {
        var category = categoryDao.getCategoryById(id);
        model.addAttribute("category", category);

        return "categories/add_edit";
    }

    @PostMapping("/categories/{id}/edit")
    public String editCategory(@ModelAttribute("category") Category category,
                               @PathVariable int id)
    {
        category.setCategoryId(id);
        categoryDao.updateCategory(category);

        return "redirect:/categories";
    }

    @GetMapping("/categories/{id}/delete")
    public String deleteCategory(Model model, @PathVariable int id)
    {
        var category = categoryDao.getCategoryById(id);
        model.addAttribute(category);

        return "/categories/delete";
    }

    @PostMapping("/categories/{id}/delete")
    public String deleteCategory(@PathVariable int id)
    {
        categoryDao.deleteCategory(id);

        return "redirect:/categories";
    }
}
