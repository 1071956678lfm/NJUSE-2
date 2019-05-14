package com.example.main.repository;

import com.example.main.model.MapperUserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MapperUserRoleRepository extends BaseRepository<MapperUserRole> {
    MapperUserRole findByUserId(String uid);
}
