(ns personal-organiser-middle.functionalities
  (:require [common-middle.functionalities :as fns]))

(def grocery-create
     "grocery-create")

(def grocery-read
     "grocery-read")

(def grocery-update
     "grocery-update")

(def grocery-delete
     "grocery-delete")

(def meal-create
     "meal-create")

(def meal-read
     "meal-read")

(def meal-update
     "meal-update")

(def meal-delete
     "meal-delete")

(def organism-create
     "organism-create")

(def organism-read
     "organism-read")

(def organism-update
     "organism-update")

(def organism-delete
     "organism-delete")

(def meal-recommendation
     "meal-recommendation")

(def functionalities
     (conj
       fns/functionalities
       grocery-create
       grocery-read
       grocery-update
       grocery-delete
       meal-create
       meal-read
       meal-update
       meal-delete
       organism-create
       organism-read
       organism-update
       organism-delete
       meal-recommendation))

