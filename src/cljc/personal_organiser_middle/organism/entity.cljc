(ns personal-organiser-middle.organism.entity)

(def gender-male
     "male")

(def gender-female
     "female")

(def activity-mainly-sitting
     "mainly_sitting")

(def activity-easy-physical-labor
     "easy_physical_labor")

(def activity-medium-physical-labor
     "medium_physical_labor")

(def activity-hard-physical-labor
     "hard_physical_labor")

(def activity-very-hard-physical-labor
     "very_hard_physical_labor")

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

