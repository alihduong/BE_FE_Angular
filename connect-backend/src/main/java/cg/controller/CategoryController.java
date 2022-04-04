package cg.controller;

import cg.model.Category;
import cg.service.Impl.ICategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryServiceImpl categoryService;

    @GetMapping()
    public ResponseEntity<List<Category>> getAllCategory(){
        return new ResponseEntity<>(categoryService.getAllCategory(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getOne(@PathVariable("id") Long id){
        return new ResponseEntity<>(categoryService.findById(id), HttpStatus.OK);
    }
}
