package KI306.Kobriy.Lab6;

class FoodCourtStore extends Store {
    private String cuisineType;

    /**
     * Створює новий заклад харчування.
     *
     * @param name Назва закладу
     * @param revenue Дохід закладу
     * @param floor Номер поверху
     * @param cuisineType Тип кухні
     */
    public FoodCourtStore(String name, double revenue, int floor, String cuisineType) {
        super(name, revenue, floor);
        this.cuisineType = cuisineType;
    }
}