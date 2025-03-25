package com.xworkz.Private;

public class IDDisplay {
        public void displayIdCard(IdCard idCard) {
            System.out.println("Material: " + idCard.getMaterial());
            String[] colors = idCard.getColors();
            for(String color: colors){
                System.out.println("color:" +color);
            }
            System.out.println("Weight: " + idCard.getWeight());
            System.out.println("Designed By: " + idCard.getDesignedBy());
        }

        public void values() {
            IdCard idCard = new IdCard();
            idCard.setMaterial("Plastic");
            idCard.setColors(new String[]{"Red", "Blue"});
            idCard.setWeight(10.5);
            idCard.setDesignedBy("NASA");
            displayIdCard(idCard);
        }
    }
