package inhatc.jap.jpastudy.sale.repository;

import inhatc.jap.jpastudy.sale.entity.Sales;
import inhatc.jap.jpastudy.sale.entity.SalesID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales, SalesID> {
}
