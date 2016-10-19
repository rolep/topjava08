package ru.javawebinar.topjava.util.exception;

/**
 * Created by rolep on 19/10/16.
 */
public class ExceptionUtil {

    public static void checkNotFound(boolean found, String msg) {
        if (!found) throw new NotFoundException("Not found entity with " + msg);
    }

    public static void checkNotFoundWithId(boolean found, int id) {
        checkNotFound(found, "id=" + id);
    }

    public static <T> T checkNotFoundWithId(T object, int id) {
        return checkNotFound(object, "id=" + id);
    }

    public static <T> T checkNotFound(T object, String msg) {
        checkNotFound(object != null, msg);
        return object;
    }
}