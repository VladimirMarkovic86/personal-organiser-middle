(ns personal-organiser-middle.functionalities-by-url
  (:require [personal-organiser-middle.functionalities :as pomfns]
            [personal-organiser-middle.request-urls :as pomrurls]
            [common-middle.functionalities-by-url :as fns-by-url]))

(defn bind-specific-functionalities-by-url
  "Adds specific CRUD functionalities beside the common ones"
  []
  (swap!
    fns-by-url/read-functionalities
    conj
    pomfns/grocery-read
    pomfns/meal-read
    pomfns/organism-read)
  (swap!
    fns-by-url/update-functionalities
    conj
    pomfns/grocery-update
    pomfns/meal-update
    pomfns/organism-update)
  (swap!
    fns-by-url/create-functionalities
    conj
    pomfns/grocery-create
    pomfns/meal-create
    pomfns/organism-create)
  (swap!
    fns-by-url/delete-functionalities
    conj
    pomfns/grocery-delete
    pomfns/meal-delete
    pomfns/organism-delete))

(defmethod fns-by-url/get-functionalities-by-url
  pomrurls/calculate-meal-recommendations-url
  [url]
  pomfns/meal-recommendation)

