
(defn hello_word_n_times [count]
 (loop [i count]
    (when (> i 0)
        (println "Hello World")
        (recur (- i 1)))))


(def n (Integer/parseInt (read-line)))
(hello_word_n_times n)
