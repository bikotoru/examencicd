package org.example.prueba2testing.Repository;

import org.example.prueba2testing.Model.Dueño;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DueñoRepository extends JpaRepository<Dueño, String> {
}