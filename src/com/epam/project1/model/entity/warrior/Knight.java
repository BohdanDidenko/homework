package com.epam.project1.model.entity.warrior;

import com.epam.project1.model.entity.Ammunition;
import com.epam.project1.model.entity.Human;
import com.epam.project1.model.entity.armor.ChestArmor;
import com.epam.project1.model.entity.armor.Helmet;
import com.epam.project1.model.entity.armor.Shield;
import com.epam.project1.model.entity.weapon.Weapon;

import java.util.LinkedList;
import java.util.List;

public class Knight extends Human {
    private ChestArmor chestArmor;
    private Helmet helmet;
    private Shield shield;
    private Weapon weapon;
    private List<Ammunition> inventory;
    private Order order;

    public Knight() {
    }

    public Knight(String name, int age, int height, int weight, double money,
                  ChestArmor chestArmor, Helmet helmet, Shield shield, Weapon weapon,
                  List<Ammunition> inventory, Order order) {
        super(name, age, height, weight, money);
        this.chestArmor = chestArmor;
        this.helmet = helmet;
        this.shield = shield;
        this.weapon = weapon;
        this.inventory = inventory;
        this.order = order;
    }

    public ChestArmor getChestArmor() {
        return chestArmor;
    }

    public void setChestArmor(ChestArmor chestArmor) {
        this.chestArmor = chestArmor;
    }

    public Helmet getHelmet() {
        return helmet;
    }

    public void setHelmet(Helmet helmet) {
        this.helmet = helmet;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public List<Ammunition> getInventory() {
        return inventory;
    }

    public List<Ammunition> getInventory(Ammunition ammunition) {
        List<Ammunition> result = new LinkedList<>();
        if(ammunition instanceof Weapon) {
            for (Ammunition thing : inventory) {
                if (thing instanceof Weapon)
                    result.add(thing);
            }
        }
        else {
            for (Ammunition thing : inventory) {
                if (thing.getClass() == ammunition.getClass())
                    result.add(thing);
            }
        }
        return result;
    }

    public void setInventory(List<Ammunition> inventory) {
        this.inventory = inventory;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Knight)) return false;
        if (!super.equals(o)) return false;

        Knight knight = (Knight) o;

        if (getChestArmor() != null ? !getChestArmor().equals(knight.getChestArmor()) : knight.getChestArmor() != null)
            return false;
        if (getHelmet() != null ? !getHelmet().equals(knight.getHelmet()) : knight.getHelmet() != null) return false;
        if (getShield() != null ? !getShield().equals(knight.getShield()) : knight.getShield() != null) return false;
        if (getWeapon() != null ? !getWeapon().equals(knight.getWeapon()) : knight.getWeapon() != null) return false;
        if (getInventory() != null ? !getInventory().equals(knight.getInventory()) : knight.getInventory() != null)
            return false;
        return getOrder() == knight.getOrder();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getChestArmor() != null ? getChestArmor().hashCode() : 0);
        result = 31 * result + (getHelmet() != null ? getHelmet().hashCode() : 0);
        result = 31 * result + (getShield() != null ? getShield().hashCode() : 0);
        result = 31 * result + (getWeapon() != null ? getWeapon().hashCode() : 0);
        result = 31 * result + (getInventory() != null ? getInventory().hashCode() : 0);
        result = 31 * result + (getOrder() != null ? getOrder().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "chestArmor=" + chestArmor +
                ", helmet=" + helmet +
                ", shield=" + shield +
                ", weapon=" + weapon +
                ", inventory=" + inventory +
                ", order=" + order +
                '}';
    }
}
