(ns test-noir.views.welcome
  (:require [test-noir.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
  (common/layout
    [:p "Welcome to test-noir"]))

(defpage "/my-page" []
  (common/layout
    [:h1 "This is my first page!"]
    [:p "Clojure is quiet strange :)"]))
