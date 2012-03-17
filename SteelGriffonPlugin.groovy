/*
 * Copyright (c) 2010 Steel - Andres Almiray. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of Steel - Andres Almiray nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS 'AS IS'
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * @author Andres Almiray
 */
class SteelGriffonPlugin {
    // the plugin version
    String version = '0.8'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swing: '0.9.5']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'BSD'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-steel-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = "Gerrit Grunwald's Steel series"
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
Delivers [@hansolo_][1]'s [SteelSeries][2] gauge components. Source code for the SteelSeries can be found at [Kenai][3].
[This post][4] provides more information on the usage and configuration of each component.

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*               | *Type*                                             | 
| -------------------- | -------------------------------------------------- |
| airCompass           | `eu.hansolo.steelseries.extras.AirCompass`         |
| altimeter            | `eu.hansolo.steelseries.extras.Altimeter`          |
| battery              | `eu.hansolo.steelseries.extras.Battery`            |
| clock                | `eu.hansolo.steelseries.extras.Clock`              |
| compass              | `eu.hansolo.steelseries.extras.Compass`            |
| digitalRadialGauge   | `eu.hansolo.steelseries.gauges.DigitalRadial`      |
| displayCircular      | `eu.hansolo.steelseries.gauges.DisplayCircular`    |
| displayMulti         | `eu.hansolo.steelseries.gauges.DisplayMulti`       |
| displayRectangular   | `eu.hansolo.steelseries.gauges.DisplayRectangular` |
| displaySingle        | `eu.hansolo.steelseries.gauges.DisplaySingle`      |
| indicator            | `eu.hansolo.steelseries.extras.Indicator`          |
| horizon              | `eu.hansolo.steelseries.extras.Horizon`            |
| led                  | `eu.hansolo.steelseries.extras.Led`                |
| level                | `eu.hansolo.steelseries.extras.Level`              |
| linearGauge          | `eu.hansolo.steelseries.gauges.Linear`             |
| lightBulb            | `eu.hansolo.steelseries.extras.LightBulb`          |
| linearBargraph       | `eu.hansolo.steelseries.gauges.LinearBargraph`     |
| radar                | `eu.hansolo.steelseries.extras.Radar`              |
| radialGauge          | `eu.hansolo.steelseries.gauges.Radial`             |
| radial1SquareGauge   | `eu.hansolo.steelseries.gauges.Radial1Square`      |
| radial1VerticalGauge | `eu.hansolo.steelseries.gauges.Radial1Vertical`    |
| radial2TopGauge      | `eu.hansolo.steelseries.gauges.Radial2Top`         |
| radialCounterGauge   | `eu.hansolo.steelseries.gauges.RadialCounter`      |
| radialBargraph       | `eu.hansolo.steelseries.gauges.RadialBargraph`     |
| sparkLine            | `eu.hansolo.steelseries.gauges.SparkLine`          |
| trafficLight         | `eu.hansolo.steelseries.extras.TrafficLight`       |
| poi                  | `eu.hansolo.steelseries.extras.Poi`                |
| stopWatch            | `eu.hansolo.steelseries.extras.StopWatch`          |
| windDirection        | `eu.hansolo.steelseries.extras.WindDirection`      |

[1]: http://twitter.com/hansolo_
[2]: http://harmoniccode.blogspot.com/2010/08/java-swing-component-library.html
[3]: http://kenai.com/projects/steelseries
[4]: http://www.jug-muenster.de/steelseries-java-swing-component-library-715/
'''
}

