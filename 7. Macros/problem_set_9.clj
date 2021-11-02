; Solution to problem set #9

;----------------------------------------------------------
; Problem 1

(defmacro $comment
  [& args]
  nil)

;----------------------------------------------------------
; Problem 2

(defmacro $and
  ([] true)
  ([x] x)
  ([a & args]
   `(let [t# ~a] 
      (if t#
        ($and ~@args)
        t#))))

;----------------------------------------------------------
; Problem 4

(defn choose-option
  [option condition]
  (cond
    (= option :while)
    `(if ~condition (recur) nil)
    
    (= option :until)
    `(if ~condition nil (recur))
    
    :else 
    (throw (ex-info "Should use a :while or :until" {}))))

(defmacro do-loop
  [& args]
  (let [body (butlast args)
        [option condition] (last args)]
    `(loop []
       ~@body
       ~(choose-option option condition))))
