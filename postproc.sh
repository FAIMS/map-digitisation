#!/usr/bin/env bash

cd module

# Add Select_User dropdown to search
string="
        <select1 ref=\"Entity_Types\">
          <label>{Entity_Types}<\/label>
          <item>
            <label>Options not loaded<\/label>
            <value>Options not loaded<\/value>
          <\/item>
        <\/select1>"
replacement="
        <group ref=\"Colgroup_1\" faims_style=\"orientation\">
          <label\/>
          <group ref=\"Col_0\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Entity_Types\">
              <label>{Entity_Types}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
          <group ref=\"Col_1\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Select_User\">
              <label>{Select_User}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
        <\/group>"
perl -0777 -i.original -pe "s/$string/$replacement/igs" ui_schema.xml

string="
              <Entity_Types\/>"
replacement="
              <Colgroup_1>
                <Col_0>
                  <Entity_Types\/>
                <\/Col_0>
                <Col_1>
                  <Select_User\/>
                <\/Col_1>
              <\/Colgroup_1>
              <Select_User\/>"
perl -0777 -i.original -pe "s/$string/$replacement/igs" ui_schema.xml

# Add Create_Record button to map
string="
        <trigger ref=\"Center_Me_1\">
          <label>{Center_Me}<\/label>
        <\/trigger>"
replacement="
        <group ref=\"Colgroup_A\" faims_style=\"orientation\">
          <label\/>
          <group ref=\"Col_0\" faims_style=\"even\">
            <label\/>
            <trigger ref=\"Center_Me_1\">
              <label>{Center_Me}<\/label>
            <\/trigger>
          <\/group>
          <group ref=\"Col_1\" faims_style=\"even\">
            <label\/>
            <trigger ref=\"Create_Record\">
              <label>{Create_Record}<\/label>
            <\/trigger>
          <\/group>
        <\/group>"
perl -0777 -i.original -pe "s/$string/$replacement/igs" ui_schema.xml

string="
              <Center_Me_1\/>"
replacement="
              <Colgroup_A>
                <Col_0>
                  <Center_Me_1\/>
                <\/Col_0>
                <Col_1>
                  <Create_Record\/>
                <\/Col_1>
              <\/Colgroup_A>
              <Select_User\/>"
perl -0777 -i.original -pe "s/$string/$replacement/igs" ui_schema.xml


rm ui_schema.xml.original

cat << EOF >> ui_styling.css
.readonly {
  color: #B2B2B2;
}
EOF

cat << EOF >> english.0.properties
All=All
Create_Record=Create Record
Select_User=Select User
EOF
