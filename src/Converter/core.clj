(ns Converter.core
  (:gen-class))

(defn -main [args]
 ; (defn parse-int [args]
    ;(Integer. args))
  ;(println (parse-int args))
  (println "Binarny:")
(println (Integer/toString (Integer. args) 2))
  (println "Osemkowy:")
(println (Integer/toString (Integer. args) 8))
  (println "Szesnastkowy:")
(println (Integer/toString (Integer. args) 16)))