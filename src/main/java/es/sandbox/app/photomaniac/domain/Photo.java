package es.sandbox.app.photomaniac.domain;

import groovy.lang.Closure;

import java.nio.file.Path;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

/**
 * Created by jeslopalo on 30/1/16.
 */
public class Photo {

    private final Path path;
    private final PhotoExtension extension;

    public Photo(Path path) {
        requireNonNull(path);

        this.path = path;
        this.extension= PhotoExtension.NEF;
    }

    public Path getPath() {
        return this.path;
    }

    public PhotoExtension getExtension() {
        return this.extension;
    }
}
