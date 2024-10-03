package com.niantic.controllers.apis;

import com.niantic.models.Category;
import com.niantic.models.Product;
import com.niantic.services.CategoryDao;
import com.niantic.services.MySqlCategoryDao;
import com.niantic.services.MySqlProductDao;
import com.niantic.services.ProductDao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductsController
{
    private ProductDao productDao = new MySqlProductDao();

    @GetMapping("/api/products/catId={id}")
    public ResponseEntity<?> getProductsByCategory(@PathVariable int id)
    {
        try
        {
            List<Product> products = productDao.getProductsByCategory(id);
            if (products.isEmpty())
            {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(products);
        }
        catch (Exception e)
        {
            Map<String, Object> errors = new HashMap<>();
            errors.put("message", "There was an error with your request.");
            errors.put("code", HttpStatus.INTERNAL_SERVER_ERROR.value());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errors);
        }
    }

    @GetMapping("/api/products/{id}")
    public ResponseEntity<?> getProductById(@PathVariable int id)
    {
        try
        {
            Product product = productDao.getProductById(id);
            if (product == null)
            {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(product);
        }
        catch (Exception e)
        {
            Map<String, Object> errors = new HashMap<>();
            errors.put("message", "There was an error with your request.");
            errors.put("code", HttpStatus.INTERNAL_SERVER_ERROR.value());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errors);
        }
    }

    @PostMapping("/api/products")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> addProduct(@RequestBody Product product)
    {
        try
        {
            productDao.addProduct(product);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        catch (Exception e)
        {
            Map<String, Object> errors = new HashMap<>();
            errors.put("message", "There was an error with your request.");
            errors.put("code", HttpStatus.INTERNAL_SERVER_ERROR.value());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errors);
        }
    }

    @PutMapping("/api/products/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> updateProduct(@PathVariable int id, @RequestBody Product product)
    {
        try
        {
            Product currentProduct = productDao.getProductById(id);
            if (currentProduct == null)
            {
                return ResponseEntity.notFound().build();
            }
            productDao.updateProduct(id, product);
            return ResponseEntity.noContent().build();
        }
        catch (Exception e)
        {
            Map<String, Object> errors = new HashMap<>();
            errors.put("message", "There was an error with your request.");
            errors.put("code", HttpStatus.INTERNAL_SERVER_ERROR.value());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errors);
        }
    }

    @DeleteMapping("/api/products/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> deleteProduct(@PathVariable int id)
    {
        try
        {
            Product currentProduct = productDao.getProductById(id);
            if (currentProduct == null)
            {
                return ResponseEntity.notFound().build();
            }
            productDao.deleteProduct(id);
            return ResponseEntity.noContent().build();
        }
        catch (Exception e)
        {
            Map<String, Object> errors = new HashMap<>();
            errors.put("message", "There was an error with your request.");
            errors.put("code", HttpStatus.INTERNAL_SERVER_ERROR.value());

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errors);
        }
    }
}
