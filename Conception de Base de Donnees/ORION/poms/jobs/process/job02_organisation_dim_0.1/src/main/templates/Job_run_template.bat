%~d0
cd %~dp0
java -Dtalend.component.manager.m2.repository="%cd%/../lib" -Xms256M -Xmx1024M -Dfile.encoding=UTF-8 -cp .;../lib/routines.jar;../lib/log4j-jcl-2.12.1.jar;../lib/log4j-slf4j-impl-2.12.1.jar;../lib/log4j-api-2.12.1.jar;../lib/log4j-core-2.12.1.jar;../lib/log4j-1.2-api-2.12.1.jar;../lib/bcprov-jdk15on-1.60.jar;../lib/commons-collections-3.2.2.jar;../lib/commons-lang-2.6.jar;../lib/commons-logging-1.1.3.jar;../lib/ojdbc7.jar;../lib/hsqldb.jar;../lib/jboss-serialization.jar;../lib/ucanaccess-2.0.9.5.jar;../lib/jackcess-encrypt-2.1.4.jar;../lib/advancedPersistentLookupLib-1.2.jar;../lib/jxl.jar;../lib/slf4j-api-1.7.25.jar;../lib/dom4j-2.1.1.jar;../lib/jackcess-2.1.12.jar;../lib/talend-oracle-timestamptz.jar;../lib/trove.jar;../lib/crypto-utils.jar;../lib/talend-ucanaccess-utils-1.0.0.jar;job02_organisation_dim_0_1.jar; orion.job02_organisation_dim_0_1.Job02_Organisation_Dim  %*