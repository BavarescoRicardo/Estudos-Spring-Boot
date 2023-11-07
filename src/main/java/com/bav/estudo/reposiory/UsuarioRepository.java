package com.bav.estudo.reposiory;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bav.estudo.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
