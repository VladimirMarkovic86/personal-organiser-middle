(ns personal-organiser-middle.meal.entity)

(def mtype-breakfast
     "breakfast")

(def mtype-lunch
     "lunch")

(def mtype-dinner
     "dinner")

(def part-of-meal-all-in-one
     "all_in_one")

(def part-of-meal-main-course
     "main_course")

(def part-of-meal-sauce
     "sauce")

(def part-of-meal-beverage
     "beverage")

(def part-of-meal-soup
     "soup")

(def part-of-meal-sweets-cakes-compote-ice-cream
     "sweets_cakes_compote_ice_cream")

(def part-of-meal-salad
     "salad")

(def table-rows-a
     (atom 10))

(def card-columns-a
     (atom 0))

(def preferences
     {:table-rows-a table-rows-a
      :card-columns-a card-columns-a})

(defn calculate-rows
  "Calculates rows for table/card view"
  []
  (if (= (int
           @card-columns-a)
         0)
    @table-rows-a
    (* @table-rows-a
       @card-columns-a))
 )

