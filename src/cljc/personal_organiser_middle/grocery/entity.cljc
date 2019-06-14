(ns personal-organiser-middle.grocery.entity)

(def diet-vegetarian
     "vegetarian")

(def diet-not-vegetarian
     "not_vegetarian")

(def group-i
     "group_i")

(def group-ii
     "group_ii")

(def group-iii
     "group_iii")

(def group-iv
     "group_iv")

(def group-v
     "group_v")

(def group-vi
     "group_vi")

(def group-vii
     "group_vii")

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

