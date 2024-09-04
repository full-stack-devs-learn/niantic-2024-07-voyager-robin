package com.niantic.controllers.apis;

import com.niantic.models.Actor;
import com.niantic.services.ActorsDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ActorsApiController
{
    private ActorsDao actorsDao = new ActorsDao();


    @GetMapping("/api/actors/page/{page}")
    public ArrayList<Actor> getAllActors(@PathVariable int page)
    {
        ArrayList<Actor> actors;
        actors = actorsDao.getActors(page);
        return actors;
    }

}
