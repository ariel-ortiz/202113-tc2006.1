; Solution to problem set #4

;----------------------------------------------------------
; Problem 1

(defn pack
  [lst]
  (partition-by identity lst))