package me.iamdoky.crawling.book.category.controller;

import lombok.RequiredArgsConstructor;
import me.iamdoky.crawling.book.category.domain.CategoryDto;
import me.iamdoky.crawling.book.category.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/category/list")
    public List<CategoryDto> getCategoryList(HttpServletRequest request ) {
        return categoryService.getCategoryList();
    }

}
