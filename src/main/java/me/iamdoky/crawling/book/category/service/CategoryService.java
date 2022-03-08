package me.iamdoky.crawling.book.category.service;

import lombok.RequiredArgsConstructor;
import me.iamdoky.crawling.book.category.component.CategoryComponent;
import me.iamdoky.crawling.book.category.domain.CategoryDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryComponent categoryComponent;

    public List<CategoryDto> getCategoryList() {
        return categoryComponent.getCategoryList();
    }


}
