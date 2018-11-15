package com.CoffeShopHibernate.CoffeeHibernate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CoffeShopHibernate.CoffeeHibernate.entity.Person;


public interface PersonRepository extends JpaRepository<Person, Integer> {

}
