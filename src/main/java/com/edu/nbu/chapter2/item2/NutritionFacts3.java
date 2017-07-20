package com.edu.nbu.chapter2.item2;

/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-07-20 11:04
 *  
 */
public class NutritionFacts3 {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    private NutritionFacts3(RealBuilder builder){
        this.carbohydrate = builder.carbohydrate;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.servingSize = builder.servingSize;
        this.sodium = builder.sodium;
    }


    public static class RealBuilder implements Builder<NutritionFacts3>{
        private final int servingSize;
        private final int servings;
        private  int calories;
        private  int fat;
        private  int sodium;
        private  int carbohydrate;

        public RealBuilder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public RealBuilder calories(int calories){
            this.calories = calories;
            return this;
        }

        public RealBuilder fat(int fat){
            this.fat = fat;
            return this;
        }

        public RealBuilder sodium(int sodium){
            this.sodium = sodium;
            return this;
        }

        public RealBuilder carbohydrate(int carbohydrate){
            this.carbohydrate = carbohydrate;
            return this;
        }

        @Override
        public NutritionFacts3 build() {
            return new NutritionFacts3(this);
        }
    }

}
