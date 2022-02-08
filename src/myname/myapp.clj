(ns myname.myapp
  (:require
   [com.fulcrologic.fulcro.components :as comp :refer [defsc]]
   #?@(:cljs [[com.fulcrologic.fulcro.dom :as dom]]
       :clj [[com.fulcrologic.fulcro.dom-server :as dom]])))
