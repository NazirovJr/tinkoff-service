package com.njr.TinkoffStockService.service;

import com.njr.TinkoffStockService.dto.FigiesDto;
import com.njr.TinkoffStockService.dto.StocksDto;
import com.njr.TinkoffStockService.dto.StocksPricesDto;
import com.njr.TinkoffStockService.dto.TickersDto;
import com.njr.TinkoffStockService.model.Stock;

public interface StockService {
    Stock getStockByTicker(String ticker);

    StocksPricesDto getPricesStocksByFigies(FigiesDto figiesDto);

    StocksDto getStocksByTickers(TickersDto tickers);
}
