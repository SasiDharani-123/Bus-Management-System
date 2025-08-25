package com.busmanagement.bus.controller;

import com.busmanagement.bus.entity.Bus;
import com.busmanagement.bus.service.BusService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/buses")
public class BusController {
    private final BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @GetMapping
    public List<Bus> getAllBuses() {
        return busService.getAllBuses();
    }

    @GetMapping("/{id}")
    public Bus getBusById(@PathVariable Long id) {
        return busService.getBusById(id);
    }

    @PostMapping
    public Bus addBus(@RequestBody Bus bus) {
        return busService.saveBus(bus);
    }

    @PutMapping("/{id}")
    public Bus updateBus(@PathVariable Long id, @RequestBody Bus bus) {
        bus.setId(id);
        return busService.saveBus(bus);
    }
    @DeleteMapping("/{id}")
    public String deleteBus(@PathVariable Long id) {
        busService.deleteBus(id);
        return "Bus deleted successfully!";
    }
}
