(ns macros)

(defmacro getenv [k]
  (System/getenv k))
