package com.example.service_marketplace.controller;

import com.example.service_marketplace.model.Service;
import com.example.service_marketplace.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @GetMapping
    public List<Service> getAllServices() {
        return serviceService.getAllServices();
    }

    @PostMapping
    public Service createService(@RequestBody Service service) {
        return serviceService.createService(service);
    }

    @GetMapping("/{id}")
    public Service getServiceById(@PathVariable Long id) {
        return serviceService.getServiceById(id);
    }

    @PutMapping("/{id}")
    public Service updateService(@PathVariable Long id, @RequestBody Service service) {
        return serviceService.updateService(id, service);
    }

    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable Long id) {
        serviceService.deleteService(id);
    }
}
