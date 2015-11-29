(ns command)
(use '[clojure.java.shell :only [sh]])

(println "will take like 60+ seconds to stop x(")
; :out is a key
(println (:out (sh "ls")))
(sh "say" "I am a comp u tar")
