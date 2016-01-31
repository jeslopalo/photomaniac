package es.sandbox.app.photomaniac.domain

import spock.lang.Specification

import java.nio.file.Paths

/**
 * Created by jeslopalo on 30/1/16.
 */
class PhotoSpecification extends Specification {

    def "it should provoke an exception when location path is null"() {
        when:
        new Photo(null)

        then:
        thrown(NullPointerException);
    }

    def "it should has a location path"() {
        setup:
        def location = Paths.get("samples", "DSC_005.NEF");

        when:
        def photo = new Photo(location);

        then:
        photo.getPath() != null
    }

    def "it should has an extension"() {
        setup:
        def location = Paths.get("samples", "DSC_005.NEF");

        when:
        def photo= new Photo(location);

        then:
        photo.getExtension() == PhotoExtension.NEF;
    }


}
