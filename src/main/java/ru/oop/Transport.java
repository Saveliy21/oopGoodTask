package ru.oop;

public class Transport implements Positioned{

    /**
     * возвращает текущую позицию
     *
     * @return позиция
     */
    @Override
    public Position getPosition() {
        return null;
    }

    /**
     * устанавливает новую позицию
     *
     * @param position позиция
     */
    @Override
    public void setPosition(Position position) {

    }

    /**
     * едет к указаному местоположению
     *
     * @param destionation место
     * @return позиция, ближайшая к destination, до которой можно доехать
     */
    public Position drive(Position destionation){
        return null;
    }
}
