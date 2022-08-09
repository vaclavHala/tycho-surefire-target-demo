Run the whole demo by `./run.sh`.

The goal is to see `Hello from listener` in the printed output.

The interesting parts are:

* [my.listener/META-INF/MANIFEST.MF](my.listener/META-INF/MANIFEST.MF) which sets declares the listener to be fragment of osgibooter
* [tests/pom.xml](tests/pom.xml) which adds the listener to target and registers the `Listener` class with junit provider

If you remove the `Fragment-Host` declaration but keep the `Listener` registration the test will fail with classloading error
but the bundles output will show the `my.listener` bundle is present in the test runtime.
