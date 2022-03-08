package me.iamdoky.crawling.practice.service;

import lombok.RequiredArgsConstructor;
import me.iamdoky.crawling.practice.component.JsoupComponent;
import me.iamdoky.crawling.practice.domain.KospiStockDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StockService {

    private final JsoupComponent jsoupComponent;

    public List<KospiStockDto> getKosPiStockList() {
        return jsoupComponent.getKosPiStockList();
    }

}
