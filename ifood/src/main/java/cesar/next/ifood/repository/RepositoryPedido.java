package cesar.next.aula19.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cesar.next.aula19.model.Pedido;

public interface RepositoryPedido extends JpaRepository<Pedido, Long> {

}
