package com.njr.TinkoffStockService.controller;

import com.njr.TinkoffStockService.dto.FigiesDto;
import com.njr.TinkoffStockService.dto.StocksDto;
import com.njr.TinkoffStockService.dto.StocksPricesDto;
import com.njr.TinkoffStockService.dto.TickersDto;
import com.njr.TinkoffStockService.dto.*;
import com.njr.TinkoffStockService.model.Stock;
import com.njr.TinkoffStockService.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class StockController {
    private final StockService stockService;

    @GetMapping("/stocks/{ticker}")
    public Stock getStock(@PathVariable String ticker) {
        return stockService.getStockByTicker(ticker);
    }

    @PostMapping("/prices")
    public StocksPricesDto getPricesStocksByFigies(@RequestBody FigiesDto figiesDto) {
        return stockService.getPricesStocksByFigies(figiesDto);
    }

    @PostMapping("/stocks/getStocksByTickers")
    public StocksDto getStocksByTickers(@RequestBody TickersDto tickers) {
        return stockService.getStocksByTickers(tickers);
    }
}
