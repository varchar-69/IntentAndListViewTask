package com.example.intentlistviewga;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<AndroidVersion> list = getAndroidVersions();

        AndroidAdapter adapter = new AndroidAdapter(this, list);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            AndroidVersion selected = list.get(position);
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("name", selected.name);
            intent.putExtra("description", selected.description);
            intent.putExtra("imageRes", selected.imageRes);
            startActivity(intent);
        });
    }

    private List<AndroidVersion> getAndroidVersions() {
        List<AndroidVersion> list = new ArrayList<>();

        list.add(new AndroidVersion("Android 1.0",
                "Android 1.0 was Google's first Android release. Web browser support, Gmail counts, Google maps, and a YouTube application were among the basic capabilities. Although it does not have an official version name, despite regional variations, it is known informally as Apple Pie. In Android 1.0, the API level is set to 1. It is no longer utilized in mobile devices. It was published on September 23, 2008.",
                R.drawable.v1));

        list.add(new AndroidVersion("Android 1.1",
                "Google released Android 1.1, which is the second version of the operating system. It included all of the features seen in the previous version, including this version improved upon Android 1.0 by adding a few new features. Caller applications now have several new capabilities, such as message details and the ability to reply by keyboard. This version also has a function for preserving MMS attachments. It also does not have an official version name like Android 1.0, although it is known as Battenburg informally. It came out on February 9, 2009.",
                R.drawable.v11));

        list.add(new AndroidVersion("Cupcake",
                "The tradition of Android version names started with the release of Android Cupcake. The version released as Android 1.5 brought a slew of improvements to the Android interface, including the first on-screen keyboard, which would become increasingly important as phones moved away from the once-ubiquitous physical keyboard format. Cupcake also included widgets and a video recording/playback feature, which would fast become one of Android's most distinctive features, as well as the platform's first-ever video recording option.",
                R.drawable.cupcake));

        list.add(new AndroidVersion("Donut",
                "Donut, Android 1.6, was introduced in the fall of 2009. Donut fixed key important issue — it added support for the Android OS's ability to function on a wide range of screen sizes and resolutions, which was a crucial feature. In the years ahead it also introduced support for CDMA networks like Verizon, which will be crucial in Android's rapid growth.",
                R.drawable.donut));

        list.add(new AndroidVersion("Eclair",
                "Android 2.0 Eclair is an Android version based on the Linux kernel 2.6.29 that was released on October 26, 2009. Donut was its predecessor, while Android 2.1 Eclair was its successor. It was first presented by Motorola Droid. Android 3.0 was updated to Android 2.1.0 eclair on January 12, 2010. On June 30, 2017, Google stopped supporting Android 2.0 and older.",
                R.drawable.eclair));

        list.add(new AndroidVersion("Froyo",
                "Google's Android 2.2 Froyo operating system is the company's third major release. It is the quickest version of the OS with some much-needed updates as well as new features. In May 2010, Android 2.2 Froyo was released. Speed, APIs and services, browser, and Android Market are four areas from this release that you should be aware of. In terms of performance, Froyo pushed Android developers to provide a better sync and notification experience for their users.",
                R.drawable.froyo));

        list.add(new AndroidVersion("Gingerbread",
                "With the introduction of Gingerbread in 2010, Android's first genuine visual identity came into existence. Design green had long been the color of Android's robots, but Gingerbread integrated the visual aspect of the operating system's design with Gingerbread. As Android began its long march toward unique design, black and green clipped into the UI.",
                R.drawable.gingerbread));

        list.add(new AndroidVersion("Honeycomb",
                "Honeycomb is unique in that it is a tablet-only operating system that, according to Google, will not be coming to smartphones. One thing distinctive in Honeycomb is that physical buttons are no longer required because they are incorporated into the OS itself. There are three software buttons on the bottom left: navigation, back, home, and the multitask app switcher. Everything involving time, date, and network connection status, and a notification bar are found in the bottom right.",
                R.drawable.honeycomb));

        list.add(new AndroidVersion("Ice Cream Sandwich",
                "Android 4.0 improves on the features that users love about Android, such as simple multitasking, rich notifications, customizable home screens, resizable widgets, and deep integration with apps, while also introducing strong new communication and sharing options.",
                R.drawable.ics));

        list.add(new AndroidVersion("Jelly Bean",
                "Android 4.3 improves on the speed enhancements introduced in its predecessor, such as vsync timing, triple buffering, decreased touch latency, CPU input boost, and hardware-accelerated 2D graphics. By adding new optimizations to the rendering pipeline, Android 4.3 now optimizes the amount of drawing commands, putting it into a more efficient GPU format by reorganizing and combining draw operations for improved drawing performance.",
                R.drawable.jellybean));

        list.add(new AndroidVersion("Kitkat",
                "Android 4.4 KitKat is an Android version released in 2013, Android 4.4 KitKat is its predecessor, while Android 5.0 Lollipop is its successor. Android 4.4 was released as Android 4.4.4 on June 19, 2014. KitKat 4.4 was designed to require features to enhance the user experience and provide a polished feel across the Android device that it is running on. Android 4.4 was designed to require less ram than before, in order to help its performance on phones with less than 1 Gigabyte of RAM.",
                R.drawable.kitkat));

        list.add(new AndroidVersion("Lollipop",
                "With the introduction of Android 5.0 Lollipop in the autumn of 2014, Google fundamentally revamped Android once more. Lollipop introduced the still-in-use Material Design standard, which gave Android, its applications, and even other Google products a completely new appearance. The card-based design that had been strewn across Android became a primary UI pattern, guiding the design of everything from alerts to the Recent Apps list.",
                R.drawable.lollipop));

        list.add(new AndroidVersion("Marshmallow",
                "Android 6.0 Marshmallow was launched as Android M during Google I/O 2015, and it is the successor to Android 5.1 Lollipop. This is accessible to developers as a preview release as of May 2015, and will be fully launched in the third quarter of 2015. Beautiful Beijing, Google's Vice President for Android, remarked at Google I/O that we've gone back to the basics and focused on the fundamentals, polishing and improving quality.",
                R.drawable.marshmallow));

        list.add(new AndroidVersion("Nougat",
                "In 2016, Google released Android Nougat, which included a native split-screen mode, a new bundled-by-app notification system, and a Data Saver feature. Nougat also included several minor but useful improvements, including as an Alt-Tab-like shortcut for switching apps.",
                R.drawable.nougat));

        list.add(new AndroidVersion("Oreo",
                "Oreo was also the first Android version to include Project Treble, an ambitious effort to modularize Android's underlying code in the hopes of making it easier for device manufacturers to provide timely software updates.",
                R.drawable.oreo));

        list.add(new AndroidVersion("Pie",
                "In August of 2018, the aroma of freshly baked Android Pie, also known as Android 9, filled the Android ecosystem. The most significant change in the Pie was its hybrid gesture/button navigation system, which replaced Android's traditional Back, Home, and Recents buttons with a multifunctional Home button and a small Back button that appeared alongside it as needed. Pie's productivity features also included a universal suggested-reply system for message alerts, a new dashboard of Digital Wellbeing settings, and intelligent adjustments to screen power and screen brightness management.",
                R.drawable.pie));

        list.add(new AndroidVersion("Android 10",
                "The Android environment has changed dramatically since Android 10. The branding marks the end of the age of dessert names, as Google has now fully embraced gesture controls. Despite these new approaches, Android remains the same OS that we are all familiar with. The upgrade has a dark mode, improved volume controls, increased security, and improved functionality. Overall, the upgrade feels like a continuation of Android Pie.",
                R.drawable.android10));

        list.add(new AndroidVersion("Android 11",
                "Android 11, which was released in early September 2020, is a significant Android update. Despite the fact that it is not as visually notable as other improvements in this version, the most notable improvements in this version concern privacy: the update expands on the extended permissions system introduced in Android 10 by allowing users to provide applications specific rights — such as location access, camera access, and microphone access — only on a limited, one-time basis.",
                R.drawable.android11));

        list.add(new AndroidVersion("Android 12",
                "Android 12 is our most personal operating system ever, with a new color extraction engine and dynamic color that responds to your wallpaper and responsive motion. Android 12 is meant to be accessible for even more people, with a more roomy layout, color contrast enhancements, and new tools to assist individuals with low vision. From color, light, and motion to changeable system colors that can be changed to reflect your personal style, it's a more personal user interface.",
                R.drawable.android12));

        return list;
    }
}