package ru.geekbrains.modelElements;

import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras;

    public Scene(int id, List<PoligonalModel> models,
                 List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        if (models.size() > 0) {
            this.Models = models;
        } else {
            throw new Exception("Нет ни одной модели");
        }
        this.Flashes = flashes;
        if (cameras.size() > 0) {
            this.Cameras = cameras;
        } else {
            throw new Exception("Нет ни одной камеры");
        }
    }

    public <T> T method1(T flash) {
        return flash;
    }

    public <T, E> T method2(T flash, E camera) {
        return flash;
    }
}