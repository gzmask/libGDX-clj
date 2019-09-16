(ns gzmask.desktop-launcher
  (:require [gzmask.libgdx :refer :all])
  (:import [com.badlogic.gdx.backends.lwjgl LwjglApplication]
           [gzmask.libgdx Game]
           [org.lwjgl.input Keyboard])
  (:gen-class))

(defn -main []
  (LwjglApplication. (gzmask.libgdx.Game.) "gzmask is awesome." 800 600)
  (Keyboard/enableRepeatEvents true))

(comment
  (-main)
  )
