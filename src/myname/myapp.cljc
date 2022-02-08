(ns myname.myapp
  (:require
   [com.fulcrologic.fulcro.components :refer [defsc]]
   [taoensso.timbre :as timbre]
   #?@(:cljs [[com.fulcrologic.fulcro.dom :as dom]]
       :clj [[com.fulcrologic.fulcro.dom-server :as dom]])))

(defsc Foo
  [_ _]
  (dom/div "foo"))

(timbre/warn "foo")
