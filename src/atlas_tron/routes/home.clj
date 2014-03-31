(ns atlas-tron.routes.home
  (:use compojure.core)
  (:require [atlas-tron.views.layout :as layout]
            [atlas-tron.util :as util]))


(defn home-page []
  (layout/render
    "base.html"))


(defroutes home-routes
  (GET "/" [] (home-page)))
