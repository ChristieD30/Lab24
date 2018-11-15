package com.CoffeShopHibernate.CoffeeHibernate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CoffeShopHibernate.CoffeeHibernate.entity.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer> {

}
