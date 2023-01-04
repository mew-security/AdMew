# ![AdMew logo](app/src/main/res/mipmap-mdpi/icon.png) AdMew

[![Build Status](https://github.com/admew/admew/actions/workflows/android-ci.yml/badge.svg)](https://github.com/AdMew/AdMew/actions/workflows/android-ci.yml) 
[![Sonarcloud Status](https://sonarcloud.io/api/project_badges/measure?project=org.admew&metric=security_rating)](https://sonarcloud.io/project/overview?id=org.admew)
[![GitHub Downloads](https://img.shields.io/github/downloads/admew/admew/total?logo=github)](https://github.com/AdMew/AdMew/releases)
[![GitHub Sponsors](https://img.shields.io/github/sponsors/perfectslayer?logo=github)](https://github.com/sponsors/PerfectSlayer)
[![License: GPL v3](https://img.shields.io/badge/License-GPL%20v3-blue.svg)](/LICENSE.md)

AdMew is an open source ad blocker for Android using the hosts file and local vpn.

[<img src="metadata/en-US/phoneScreenshots/screenshot1.png"
    alt="Home screen"
    height="256">](metadata/en-US/phoneScreenshots/screenshot1.png)
[<img src="metadata/en-US/phoneScreenshots/screenshot2.png"
    alt="Preferences screen"
    height="256">](metadata/en-US/phoneScreenshots/screenshot2.png)
[<img src="metadata/en-US/phoneScreenshots/screenshot3.png"
    alt="Root based ad blocker screen"
    height="256">](metadata/en-US/phoneScreenshots/screenshot3.png)
[<img src="metadata/en-US/phoneScreenshots/screenshot4.png"
    alt="Backup and restore screen"
    height="256">](metadata/en-US/phoneScreenshots/screenshot4.png)
[<img src="metadata/en-US/phoneScreenshots/screenshot5.png"
    alt="Help screen"
    height="256">](metadata/en-US/phoneScreenshots/screenshot5.png)

For more information visit https://admew.org

## Installing

There are two kinds of release:
* The preview builds: on the bleeding edge of development - for testers or adventurous
* The stable builds: ready for every day usage - for end users

### Preview builds

**Requirements:** Android 8 _Oreo_ or above

For users with bugs, there may be preview builds available from the [XDA development thread](https://forum.xda-developers.com/showthread.php?t=2190753) and [AdMew official website](https://app.admew.org/beta.apk).
It is recommended to try those builds to see if your issue is resolved before creating an issue.
The preview builds may contain bug fixes or new features for new android versions.

[<img src="Resources/get-it-on-admew.png"
      alt="Get it on official AdMew website"
      height="80">](https://app.admew.org/beta.apk)
[<img src="Resources/XDADevelopers.png"
      raw="true"
      alt="Get it on XDA forum"
      height="60">](https://forum.xda-developers.com/showthread.php?t=2190753)

### Stable builds

**Requirements:**
* Android Android 8 _Oreo_ or above

After preview builds have been tested by the more technical or responsive community within the forums, we will then post the stable build to F-Droid.

[<img src="Resources/get-it-on-admew.png"
    alt="Get it on official AdMew website"
    height="80">](https://app.admew.org/admew.apk)
[<img src="Resources/get-it-on-fdroid.png"
      raw="true"
      alt="Get it on F-Droid"
      height="80">](https://f-droid.org/app/org.admew)

For devices older than Android 8 _Oreo_, use the version 4 of AdMew.

## Get Host File Sources

See the [Wiki](https://github.com/AdMew/AdMew/wiki), in particular the page [HostsSources](https://github.com/AdMew/AdMew/wiki/HostsSources) for an assorted list of sources you can use in AdMew.
Add the ones you like to the AdMew "Hosts sources" section.

## Getting Help

You can post [Issues](https://github.com/AdMew/AdMew/issues) here or obtain more detailed community support via the [XDA developer thread](http://forum.xda-developers.com/showthread.php?t=2190753).

## Contributing

You want to be involved in the project? Welcome onboard!  
Check [the contributing guide](CONTRIBUTING.md) to learn how to report bugs, suggest features and make you first code contribution :+1:

If you are looking for translating the application in your language, [the translating guide](TRANSLATING.md) is for you.

## Project Status

AdMew is actively developed by:
* Bruce Bujon ([@PerfectSlayer](https://github.com/PerfectSlayer)) - Developer  
[PayPal](https://paypal.me/BruceBUJON) | [GitHub Sponsorship](https://github.com/sponsors/PerfectSlayer)
* Daniel Mönch ([@Vankog](https://github.com/Vankog)) - Translations
* Jawz101 ([@jawz101](https://github.com/jawz101)) - Hosts list
* Anxhelo Lushka ([@AnXh3L0](https://github.com/AnXh3L0)) - Web site

We do not forget the past maintainers:
* Dāvis Mošenkovs ([@DavisNT](https://github.com/DavisNT)) - Developer  
[Paypal](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=5GUHNXYE58RZS&lc=US&item_name=AdMew%20Donation&no_note=0&no_shipping=1)
* [@0-kaladin](https://github.com/0-kaladin) - Developer and XDA OP
* Sanjay Govind ([@sanjay900](https://github.com/sanjay900)) - Developer

And we thank a lot to the original author:
* Dominik Schürmann ([@dschuermann](https://github.com/dschuermann)) - Original developer  
[Paypal](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=android%40schuermann.eu&lc=US&item_name=AdMew%20Donation&no_note=0&no_shipping=1&currency_code=EUR) | [Flattr](https://flattr.com/thing/369138/AdMew-Ad-blocker-for-Android) | BTC: `173kZxbkKuvnF5fa5b7t21kqU5XfEvvwTs`

## Permissions

AdMew requires the following permissions:

* `INTERNET` to download hosts files and application updates. It can send bug reports and telemetry [if the user wants to (opt-in only)](https://github.com/AdMew/AdMew/wiki/Telemetry)
* `ACCESS_NETWORK_STATE` to restart VPN on network connection change
* `RECEIVE_BOOT_COMPLETED` to start the VPN on boot
* `FOREGROUND_SERVICE` to run the VPN service in foreground
* `REQUEST_INSTALL_PACKAGES` to update the application using the builtin updater
* `QUERY_ALL_PACKAGES` to let the user pick the applications to exclude from VPN

## Licenses

AdMew is licensed under the GPLv3+.  
The file LICENSE includes the full license text.
For more details, check [the license notes](LICENSE.md).
