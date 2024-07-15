package com.example.service_marketplace.service;

import com.example.service_marketplace.model.Service;
import com.example.service_marketplace.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }

    public Service createService(Service service) {
        return serviceRepository.save(service);
    }

    public Service getServiceById(Long id) {
        return serviceRepository.findById(id).orElse(null);
    }

    public Service updateService(Long id, Service service) {
        service.setId(id);
        return serviceRepository.save(service);
    }

    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }
}
