package me.iamdoky.crawling.practice.controller;

import lombok.RequiredArgsConstructor;
import me.iamdoky.crawling.practice.domain.KospiStockDto;
import me.iamdoky.crawling.practice.service.StockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class StockController {

    private final StockService stockService;

    @GetMapping("/kospi/all")
    public List<KospiStockDto> getKosPiStockList(HttpServletRequest request) {
        return stockService.getKosPiStockList();

    }

}
