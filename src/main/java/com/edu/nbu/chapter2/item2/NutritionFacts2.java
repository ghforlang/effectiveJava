package com.edu.nbu.chapter2.item2;

/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-07-20 10:42
 *  
 */
//builder模式构建对象
public class NutritionFacts2 {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    //必须有私有的构造方法
    private NutritionFacts2(Builder builder){
        this.carbohydrate = builder.carbohydrate;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.servingSize = builder.servingSize;
        this.sodium = builder.sodium;
    }

    public static class Builder{
        private final int servingSize;
        private final int servings;
        private  int calories;
        private  int fat;
        private  int sodium;
        private  int carbohydrate;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int calories){
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat){
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium){
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate){
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts2 build(){
            return new NutritionFacts2(this);
        }
    }

}

