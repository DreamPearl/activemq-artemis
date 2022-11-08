# Broker Properties

**name**: criticalAnalyzerCheckPeriod

type: long

default: 0

xml name: critical-analyzer-check-period

description: The timeout here will be defaulted to half critical-analyzer-timeout, calculation happening at runtime


---

**name**: pageMaxConcurrentIO

type: int

default: 5

xml name: page-max-concurrent-io

description: The max number of concurrent reads allowed on paging


---

**name**: messageCounterSamplePeriod

type: long

default: 10000

xml name: message-counter-sample-period

description: the sample period (in ms) to use for message counters


---

**name**: networkCheckNIC

type: String

default: 

xml name: network-check-nic

description: The network interface card name to be used to validate the address.


---

**name**: globalMaxSize

type: long

default: -1

xml name: global-max-size

description: Size (in bytes) before all addresses will enter into their Full Policy configured upon messages being
                  produced. Supports byte notation like "K", "Mb", "GB", etc.


---

**name**: journalFileSize

type: int

default: 10485760

xml name: journal-file-size

description: The size (in bytes) of each journal file. Supports byte notation like "K", "Mb", "GB", etc.


---

**name**: configurationFileRefreshPeriod

type: long

default: 5000

xml name: configuration-file-refresh-period

description: how often (in ms) to check the configuration file for modifications


---

**name**: diskScanPeriod

type: int

default: 5000

xml name: disk-scan-period

description: how often (in ms) to scan the disks for full disks.


---

**name**: journalRetentionDirectory

type: String

default: 

xml name: journal-retention-directory

description: the directory to store journal-retention message in and rention configuraion.


---

**name**: networkCheckPeriod

type: long

default: 10000

xml name: network-check-period

description: A frequency in milliseconds to how often we should check if the network is still up


---

**name**: journalBufferSize_AIO

type: int

default: 501760

xml name: journal-buffer-size

description: The size (in bytes) of the internal buffer on the journal. Supports byte notation like "K", "Mb",
                  "GB", etc.


---

**name**: networkCheckURLList

type: String

default: 

xml name: network-check-URL-list

description: A comma separated list of URLs to be used to validate if the broker should be kept up


---

**name**: networkCheckTimeout

type: int

default: 1000

xml name: network-check-timeout

description: A timeout used in milliseconds to be used on the ping.


---

**name**: pageSyncTimeout

type: int

default: 

xml name: page-sync-timeout

description: The timeout (in nanoseconds) used to sync pages. The exact default value
                  depend on whether the journal is ASYNCIO or NIO.


---

**name**: journalPoolFiles

type: int

default: -1

xml name: journal-pool-files

description: how many journal files to pre-create


---

**name**: criticalAnalyzer

type: boolean

default: true

xml name: critical-analyzer

description: should analyze response time on critical paths and decide for broker log, shutdown or halt.


---

**name**: maxDiskUsage

type: int

default: 90

xml name: max-disk-usage

description: Max percentage of disk usage before the system blocks or fails clients.


---

**name**: readWholePage

type: boolean

default: false

xml name: read-whole-page

description: Whether the whole page is read while getting message after page cache is evicted.


---

**name**: globalMaxMessages

type: long

default: -1

xml name: global-max-messages

description: Number of messages before all addresses will enter into their Full Policy configured.
                  It works in conjunction with global-max-size, being watever value hits its maximum first.


---

**name**: internalNamingPrefix

type: String

default: 

xml name: internal-naming-prefix

description: Artemis uses internal queues and addresses for implementing certain behaviours.  These queues and addresses
                  will be prefixed by default with "$.activemq.internal" to avoid naming clashes with user namespacing.
                  This can be overridden by setting this value to a valid Artemis address.


---

**name**: journalFileOpenTimeout

type: int

default: 5

xml name: journal-file-open-timeout

description: the length of time in seconds to wait when opening a new Journal file before timing out and failing


---

**name**: journalCompactPercentage

type: int

default: 30

xml name: journal-compact-percentage

description: The percentage of live data on which we consider compacting the journal


---

**name**: createBindingsDir

type: boolean

default: true

xml name: create-bindings-dir

description: true means that the server will create the bindings directory on start up


---

**name**: suppressSessionNotifications

type: boolean

default: false

xml name: suppress-session-notifications

description: Whether or not to suppress SESSION_CREATED and SESSION_CLOSED notifications.
                  Set to true to reduce notification overhead. However, these are required to
                  enforce unique client ID utilization in a cluster for MQTT clients.


---

**name**: journalBufferTimeout_AIO

type: int

default: 

xml name: journal-buffer-timeout

description: The timeout (in nanoseconds) used to flush internal buffers on the journal. The exact default value
                  depend on whether the journal is ASYNCIO or NIO.


---

**name**: journalType

type: JournalType

default: ASYNCIO

xml name: journal-type

description: the type of journal to use


---

**name**: name

type: String

default: 

xml name: name

description: Node name. If set, it will be used in topology notifications.


---

**name**: networkCheckPingCommand

type: String

default: 

xml name: network-check-ping-command

description: The ping command used to ping IPV4 addresses.


---

**name**: temporaryQueueNamespace

type: String

default: 

xml name: temporary-queue-namespace

description: the namespace to use for looking up address settings for temporary queues


---

**name**: pagingDirectory

type: String

default: data/paging

xml name: paging-directory

description: the directory to store paged messages in


---

**name**: journalDirectory

type: String

default: data/journal

xml name: journal-directory

description: the directory to store the journal files in


---

**name**: journalBufferSize_NIO

type: int

default: 501760

xml name: journal-buffer-size

description: The size (in bytes) of the internal buffer on the journal. Supports byte notation like "K", "Mb",
                  "GB", etc.


---

**name**: journalDeviceBlockSize

type: Integer

default: 

xml name: journal-device-block-size

description: The size in bytes used by the device. This is usually translated as fstat/st_blksize
                  And this is a way to bypass the value returned as st_blksize.


---

**name**: nodeManagerLockDirectory

type: String

default: 

xml name: node-manager-lock-directory

description: the directory to store the node manager lock file


---

**name**: messageCounterMaxDayHistory

type: int

default: 10

xml name: message-counter-max-day-history

description: how many days to keep message counter history


---

**name**: networkCheckPing6Command

type: String

default: 

xml name: network-check-ping6-command

description: The ping command used to ping IPV6 addresses.


---

**name**: largeMessagesDirectory

type: String

default: data/largemessages

xml name: large-messages-directory

description: the directory to store large messages


---

**name**: memoryWarningThreshold

type: int

default: 25

xml name: memory-warning-threshold

description: Percentage of available memory which will trigger a warning log


---

**name**: mqttSessionScanInterval

type: long

default: 5000

xml name: mqtt-session-scan-interval

description: how often (in ms) to scan for expired MQTT sessions


---

**name**: journalMaxAtticFiles

type: int

default: 

xml name: journal-max-attic-files

description: 


---

**name**: journalSyncTransactional

type: boolean

default: true

xml name: journal-sync-transactional

description: if true wait for transaction data to be synchronized to the journal before returning response to
                  client


---

**name**: logJournalWriteRate

type: boolean

default: false

xml name: log-journal-write-rate

description: Whether to log messages about the journal write rate


---

**name**: journalMaxIO_AIO

type: int

default: 

xml name: journal-max-io

description: the maximum number of write requests that can be in the AIO queue at any one time. Default is 500 for
                  AIO and 1 for NIO.


---

**name**: messageExpiryScanPeriod

type: long

default: 30000

xml name: message-expiry-scan-period

description: how often (in ms) to scan for expired messages


---

**name**: criticalAnalyzerTimeout

type: long

default: 120000

xml name: critical-analyzer-timeout

description: The default timeout used on analyzing timeouts on the critical path.


---

**name**: messageCounterEnabled

type: boolean

default: false

xml name: message-counter-enabled

description: true means that message counters are enabled


---

**name**: addressQueueScanPeriod

type: long

default: 30000

xml name: address-queue-scan-period

description: how often (in ms) to scan for addresses and queues that need to be deleted


---

**name**: journalCompactMinFiles

type: int

default: 10

xml name: journal-compact-min-files

description: The minimal number of data files before we can start compacting


---

**name**: createJournalDir

type: boolean

default: true

xml name: create-journal-dir

description: true means that the journal directory will be created


---

**name**: memoryMeasureInterval

type: long

default: -1

xml name: memory-measure-interval

description: frequency to sample JVM memory in ms (or -1 to disable memory sampling)


---

**name**: journalSyncNonTransactional

type: boolean

default: true

xml name: journal-sync-non-transactional

description: if true wait for non transaction data to be synced to the journal before returning response to client.


---

**name**: connectionTtlCheckInterval

type: long

default: 2000

xml name: connection-ttl-check-interval

description: how often (in ms) to check connections for ttl violation


---

**name**: rejectEmptyValidatedUser

type: boolean

default: false

xml name: reject-empty-validated-user

description: true means that the server will not allow any message that doesn't have a validated user, in JMS this is JMSXUserID


---

**name**: journalMaxIO_NIO

type: int

default: 

xml name: journal-max-io

description: the maximum number of write requests that can be in the AIO queue at any one time. Default is 500 for
                  AIO and 1 for NIO.
Currently Broker properties only supports using an integer and measures in bytes


---

**name**: transactionTimeoutScanPeriod

type: long

default: 1000

xml name: transaction-timeout-scan-period

description: how often (in ms) to scan for timeout transactions


---

**name**: systemPropertyPrefix

type: String

default: 

xml name: system-property-prefix

description: This defines the prefix which we will use to parse System properties for the configuration. Default=


---

**name**: transactionTimeout

type: long

default: 300000

xml name: transaction-timeout

description: how long (in ms) before a transaction can be removed from the resource manager after create time


---

**name**: journalLockAcquisitionTimeout

type: long

default: -1

xml name: journal-lock-acquisition-timeout

description: how long (in ms) to wait to acquire a file lock on the journal


---

**name**: journalBufferTimeout_NIO

type: int

default: 

xml name: journal-buffer-timeout

description: The timeout (in nanoseconds) used to flush internal buffers on the journal. The exact default value
                  depend on whether the journal is ASYNCIO or NIO.


---

**name**: journalMinFiles

type: int

default: 2

xml name: journal-min-files

description: how many journal files to pre-create


---

## bridgeConfigurations
**name**: bridgeConfigurations.{NAME}.retryIntervalMultiplier

type: double

default: 1

xml name: retry-interval-multiplier

description: multiplier to apply to successive retry intervals


---

**name**: bridgeConfigurations.{NAME}.maxRetryInterval

type: long

default: 2000

xml name: max-retry-interval

description: Limit to the retry-interval growth (due to retry-interval-multiplier)


---

**name**: bridgeConfigurations.{NAME}.filterString

type: String

default: 

xml name: filter-string

description: 


---

**name**: bridgeConfigurations.{NAME}.connectionTTL

type: long

default: 60000

xml name: connection-ttl

description: how long to keep a connection alive in the absence of any data arriving from the client. This should
                  be greater than the ping period.


---

**name**: bridgeConfigurations.{NAME}.confirmationWindowSize

type: int

default: 1048576

xml name: confirmation-window-size

description: Once the bridge has received this many bytes, it sends a confirmation. Supports byte notation like
                  "K", "Mb", "GB", etc.


---

**name**: bridgeConfigurations.{NAME}.staticConnectors

type: List

default: 

xml name: static-connectors

description: 


---

**name**: bridgeConfigurations.{NAME}.reconnectAttemptsOnSameNode

type: int

default: 

xml name: reconnect-attempts-on-same-node

description: 


---

**name**: bridgeConfigurations.{NAME}.concurrency

type: int

default: 1

xml name: concurrency

description: Number of concurrent workers, more workers can help increase throughput on high latency networks.
                  Defaults to 1


---

**name**: bridgeConfigurations.{NAME}.transformerConfiguration

type: TransformerConfiguration

default: 

xml name: transformer-configuration

description: 


---

**name**: bridgeConfigurations.{NAME}.transformerConfiguration.className

type: String

default: 

xml name: class-name

description: 


---

**name**: bridgeConfigurations.{NAME}.transformerConfiguration.properties

type: Map

default: 

xml name: property

description: A KEY/VALUE pair to set on the transformer, i.e. ...properties.MY_PROPERTY=MY_VALUE


---

**name**: bridgeConfigurations.{NAME}.password

type: String

default: 

xml name: password

description: password, if unspecified the cluster-password is used


---

**name**: bridgeConfigurations.{NAME}.queueName

type: String

default: 

xml name: queue-name

description: name of queue that this bridge consumes from


---

**name**: bridgeConfigurations.{NAME}.forwardingAddress

type: String

default: 

xml name: forwarding-address

description: address to forward to. If omitted original address is used


---

**name**: bridgeConfigurations.{NAME}.routingType

type: ComponentConfigurationRoutingType

default: PASS

xml name: routing-type

description: how should the routing-type on the bridged messages be set?


---

**name**: bridgeConfigurations.{NAME}.name

type: String

default: 

xml name: name

description: unique name for this bridge


---

**name**: bridgeConfigurations.{NAME}.ha

type: boolean

default: false

xml name: ha

description: whether this bridge supports fail-over


---

**name**: bridgeConfigurations.{NAME}.initialConnectAttempts

type: int

default: -1

xml name: initial-connect-attempts

description: maximum number of initial connection attempts, -1 means 'no limits'


---

**name**: bridgeConfigurations.{NAME}.retryInterval

type: long

default: 2000

xml name: retry-interval

description: period (in ms) between successive retries


---

**name**: bridgeConfigurations.{NAME}.producerWindowSize

type: int

default: 1048576

xml name: producer-window-size

description: Producer flow control. Supports byte notation like "K", "Mb", "GB", etc.


---

**name**: bridgeConfigurations.{NAME}.clientFailureCheckPeriod

type: long

default: 30000

xml name: check-period

description: The period (in milliseconds) a bridge's client will check if it failed to receive a ping from the
                  server. -1 disables this check.


---

**name**: bridgeConfigurations.{NAME}.discoveryGroupName

type: String

default: 

xml name: discovery-group-ref

description: 


---

**name**: bridgeConfigurations.{NAME}.user

type: String

default: 

xml name: user

description: username, if unspecified the cluster-user is used


---

**name**: bridgeConfigurations.{NAME}.useDuplicateDetection

type: boolean

default: true

xml name: use-duplicate-detection

description: should duplicate detection headers be inserted in forwarded messages?


---

**name**: bridgeConfigurations.{NAME}.minLargeMessageSize

type: int

default: 102400

xml name: min-large-message-size

description: Any message larger than this size (in bytes) is considered a large message (to be sent in
                  chunks). Supports byte notation like "K", "Mb", "GB", etc.


---

## AMQPConnections
**name**: AMQPConnections.{NAME}.reconnectAttempts

type: int

default: -1

xml name: reconnect-attempts

description: How many attempts should be made to reconnect after failure


---

**name**: AMQPConnections.{NAME}.password

type: String

default: 

xml name: password

description: Password used to connect. If not defined it will try an anonymous connection.


---

**name**: AMQPConnections.{NAME}.retryInterval

type: int

default: 5000

xml name: retry-interval

description: period (in ms) between successive retries


---

**name**: AMQPConnections.{NAME}.connectionElements

type: AMQPMirrorBrokerConnectionElement

default: 

xml name: amqp-connection

description: An AMQP Broker Connection that supports 4 types, these are:
1. Mirrors - The broker uses an AMQP connection to another broker and duplicates messages and sends acknowledgements over the wire.
2. Senders - Messages received on specific queues are transferred to another endpoint.
3. Receivers - The broker pulls messages from another endpoint.
4. Peers - The broker creates both senders and receivers on another endpoint that knows how to handle them. This is currently implemented by Apache Qpid Dispatch.
Currently only mirror type is supported


---

**name**: AMQPConnections.{NAME}.connectionElements.{NAME}.messageAcknowledgements

type: boolean

default: 

xml name: message-acknowledgements

description: If true then message acknowledgements will be mirrored


---

**name**: AMQPConnections.{NAME}.connectionElements.{NAME}.queueRemoval

type: boolean

default: 

xml name: queue-removal

description: Should mirror queue deletion events for addresses and queues.


---

**name**: AMQPConnections.{NAME}.connectionElements.{NAME}.addressFilter

type: String

default: 

xml name: address-filter

description: This defines a filter that mirror will use to determine witch events will be forwarded toward
               target server based on source address.


---

**name**: AMQPConnections.{NAME}.connectionElements.{NAME}.queueCreation

type: boolean

default: 

xml name: queue-creation

description: Should mirror queue creation events for addresses and queues.


---

**name**: AMQPConnections.{NAME}.autostart

type: boolean

default: true

xml name: auto-start

description: should the broker connection be started when the server is started.


---

**name**: AMQPConnections.{NAME}.user

type: String

default: 

xml name: user

description: User name used to connect. If not defined it will try an anonymous connection.


---

**name**: AMQPConnections.{NAME}.uri

type: String

default: 

xml name: uri

description: uri of the amqp connection


---

## divertConfiguration
**name**: divertConfiguration.transformerConfiguration

type: TransformerConfiguration

default: 

xml name: transformer-configuration

description: 


---

**name**: divertConfiguration.transformerConfiguration.className

type: String

default: 

xml name: class-name

description: 


---

**name**: divertConfiguration.transformerConfiguration.properties

type: Map

default: 

xml name: property

description: A KEY/VALUE pair to set on the transformer, i.e. ...properties.MY_PROPERTY=MY_VALUE


---

**name**: divertConfiguration.filterString

type: String

default: 

xml name: filter-string

description: 


---

**name**: divertConfiguration.routingName

type: String

default: 

xml name: routing-name

description: the routing name for the divert


---

**name**: divertConfiguration.address

type: String

default: 

xml name: address

description: the address this divert will divert from


---

**name**: divertConfiguration.forwardingAddress

type: String

default: 

xml name: forwarding-address

description: the forwarding address for the divert


---

**name**: divertConfiguration.routingType

type: ComponentConfigurationRoutingType( MULTICAST ANYCAST STRIP PASS )

default: 

xml name: routing-type

description: how should the routing-type on the diverted messages be set?


---

**name**: divertConfiguration.exclusive

type: boolean

default: false

xml name: exclusive

description: whether this is an exclusive divert


---

## addressSettings
**name**: addressSettings.{ADDRESS}.expiryQueuePrefix

type: SimpleString

default: EXP.

xml name: expiry-queue-prefix

description: the prefix to use for auto-created expiry queues


---

**name**: addressSettings.{ADDRESS}.configDeleteDiverts

type: DeletionPolicy( OFF FORCE )

default: OFF

xml name: config-delete-addresses

description: What to do when an address is no longer in broker.xml.
                     OFF = will do nothing addresses will remain,
                     FORCE = delete address and its queues even if messages remaining.


---

**name**: addressSettings.{ADDRESS}.defaultConsumerWindowSize

type: int

default: -1

xml name: default-consumer-window-size

description: the default window size for a consumer


---

**name**: addressSettings.{ADDRESS}.maxReadPageBytes

type: int

default: 20M

xml name: max-read-page-bytes

description: How many bytes are we allowed to read from page into the Queue each time. We should read more data from pages as messages are acknowledged until it fills up the size.
                     Between this and max-read-page-messages the system will stop reading based on whatever hits the mark first.


---

**name**: addressSettings.{ADDRESS}.deadLetterQueuePrefix

type: SimpleString

default: DLQ.

xml name: dead-letter-queue-prefix

description: the prefix to use for auto-created dead letter queues


---

**name**: addressSettings.{ADDRESS}.defaultGroupRebalancePauseDispatch

type: boolean

default: false

xml name: default-group-rebalance-pause-dispatch

description: whether to pause dispatch when rebalancing groups


---

**name**: addressSettings.{ADDRESS}.autoCreateAddresses

type: Boolean

default: true

xml name: auto-create-addresses

description: whether or not to automatically create addresses when a client sends a message to or attempts to
                     consume a message from a queue mapped to an address that doesn't exist


---

**name**: addressSettings.{ADDRESS}.slowConsumerThreshold

type: long

default: 

xml name: slow-consumer-threshold

description: The minimum rate of message consumption allowed before a consumer is considered "slow."  Measurement
                     unit is defined by the slow-consumer-threshold-measurement-unit parameter.  By default this is
                     messages-per-seconds


---

**name**: addressSettings.{ADDRESS}.managementMessageAttributeSizeLimit

type: int

default: 256

xml name: management-message-attribute-size-limit

description: the size limit of any message attribute value returned from a browse ,list or filter. Attribute values that exceed with be truncated


---

**name**: addressSettings.{ADDRESS}.autoCreateExpiryResources

type: boolean

default: false

xml name: auto-create-expiry-resources

description: whether or not to automatically create the expiry-address and/or a corresponding queue
                     on that address when a message is sent to a matching queue


---

**name**: addressSettings.{ADDRESS}.pageSizeBytes

type: int

default: 10485760

xml name: page-size-bytes

description: The page size (in bytes) to use for an address. Supports byte notation like "K", "Mb",
                     "GB", etc.


---

**name**: addressSettings.{ADDRESS}.minExpiryDelay

type: Long

default: -1

xml name: min-expiry-delay

description: Overrides the expiration time for messages using a lower value. "-1" disables this setting.


---

**name**: addressSettings.{ADDRESS}.expiryQueueSuffix

type: SimpleString

default: 

xml name: expiry-queue-suffix

description: the suffix to use for auto-created expiry queues


---

**name**: addressSettings.{ADDRESS}.defaultConsumersBeforeDispatch

type: Integer

default: 0

xml name: default-consumers-before-dispatch

description: the default number of consumers needed before dispatch can start for queues under the address.


---

**name**: addressSettings.{ADDRESS}.configDeleteQueues

type: DeletionPolicy( OFF FORCE )

default: OFF

xml name: config-delete-queues

description: What to do when a queue is no longer in broker.xml.
                     OFF = will do nothing queues will remain,
                     FORCE = delete queues even if messages remaining.


---

**name**: addressSettings.{ADDRESS}.enableIngressTimestamp

type: boolean

default: false

xml name: enable-ingress-timestamp

description: whether or not the broker should set its own timestamp on incoming messages to the matching address


---

**name**: addressSettings.{ADDRESS}.expiryAddress

type: SimpleString

default: 

xml name: expiry-address

description: the address to send expired messages to


---

**name**: addressSettings.{ADDRESS}.autoDeleteCreatedQueues

type: Boolean

default: false

xml name: auto-delete-created-queues

description: whether or not to delete created queues when the queue has 0 consumers and 0 messages


---

**name**: addressSettings.{ADDRESS}.managementBrowsePageSize

type: int

default: 200

xml name: management-browse-page-size

description: how many message a management resource can browse, list or filter


---

**name**: addressSettings.{ADDRESS}.autoDeleteQueues

type: Boolean

default: true

xml name: auto-delete-queues

description: whether or not to delete auto-created queues when the queue has 0 consumers and 0 messages


---

**name**: addressSettings.{ADDRESS}.retroactiveMessageCount

type: long

default: 0

xml name: retroactive-message-count

description: the number of messages to preserve for future queues created on the matching address


---

**name**: addressSettings.{ADDRESS}.maxExpiryDelay

type: Long

default: -1

xml name: max-expiry-delay

description: Overrides the expiration time for messages using a higher value. "-1" disables this setting.


---

**name**: addressSettings.{ADDRESS}.maxDeliveryAttempts

type: int

default: 10

xml name: max-delivery-attempts

description: how many times to attempt to deliver a message before sending to dead letter address


---

**name**: addressSettings.{ADDRESS}.defaultGroupFirstKey

type: SimpleString

default: 

xml name: default-group-first-key

description: key used to mark a message is first in a group for a consumer


---

**name**: addressSettings.{ADDRESS}.slowConsumerCheckPeriod

type: long

default: 

xml name: slow-consumer-check-period

description: How often to check for slow consumers on a particular queue. Measured in seconds.


---

**name**: addressSettings.{ADDRESS}.defaultPurgeOnNoConsumers

type: Boolean

default: false

xml name: default-purge-on-no-consumers

description: purge the contents of the queue once there are no consumers


---

**name**: addressSettings.{ADDRESS}.defaultLastValueKey

type: SimpleString

default: 

xml name: default-last-value-key

description: the property to use as the key for a last value queue by default


---

**name**: addressSettings.{ADDRESS}.autoCreateQueues

type: Boolean

default: true

xml name: auto-create-queues

description: whether or not to automatically create a queue when a client sends a message to or attempts to consume
                     a message from a queue


---

**name**: addressSettings.{ADDRESS}.defaultExclusiveQueue

type: Boolean

default: false

xml name: default-exclusive-queue

description: whether to treat the queues under the address as exclusive queues by default


---

**name**: addressSettings.{ADDRESS}.defaultMaxConsumers

type: Integer

default: -1

xml name: default-max-consumers

description: the maximum number of consumers allowed on this queue at any one time


---

**name**: addressSettings.{ADDRESS}.defaultQueueRoutingType

type: RoutingType( MULTICAST ANYCAST )

default: MULTICAST

xml name: default-queue-routing-type

description: the routing-type used on auto-created queues


---

**name**: addressSettings.{ADDRESS}.messageCounterHistoryDayLimit

type: int

default: 0

xml name: message-counter-history-day-limit

description: how many days to keep message counter history for this address


---

**name**: addressSettings.{ADDRESS}.defaultGroupRebalance

type: boolean

default: false

xml name: default-group-rebalance

description: whether to rebalance groups when a consumer is added


---

**name**: addressSettings.{ADDRESS}.maxSizeBytesRejectThreshold

type: long

default: -1

xml name: max-size-bytes-reject-threshold

description: used with the address full BLOCK policy, the maximum size (in bytes) an address can reach before
                     messages start getting rejected. Works in combination with max-size-bytes for AMQP protocol only.
                     Default = -1 (no limit).


---

**name**: addressSettings.{ADDRESS}.defaultAddressRoutingType

type: RoutingType( MULTICAST ANYCAST )

default: MULTICAST

xml name: default-address-routing-type

description: the routing-type used on auto-created addresses


---

**name**: addressSettings.{ADDRESS}.autoCreateDeadLetterResources

type: boolean

default: false

xml name: auto-create-dead-letter-resources

description: whether or not to automatically create the dead-letter-address and/or a corresponding queue
                     on that address when a message found to be undeliverable


---

**name**: addressSettings.{ADDRESS}.pageCacheMaxSize

type: int

default: 

xml name: page-cache-max-size

description: 


---

**name**: addressSettings.{ADDRESS}.maxRedeliveryDelay

type: long

default: 

xml name: max-redelivery-delay

description: Maximum value for the redelivery-delay


---

**name**: addressSettings.{ADDRESS}.deadLetterAddress

type: SimpleString

default: 

xml name: dead-letter-address

description: the address to send dead messages to


---

**name**: addressSettings.{ADDRESS}.configDeleteAddresses

type: DeletionPolicy

default: OFF

xml name: config-delete-addresses

description: What to do when an address is no longer in broker.xml.
                     OFF = will do nothing addresses will remain,
                     FORCE = delete address and its queues even if messages remaining.


---

**name**: addressSettings.{ADDRESS}.autoDeleteQueuesMessageCount

type: long

default: 0

xml name: auto-delete-queues-message-count

description: the message count the queue must be at or below before it can be evaluated to be auto deleted, 0 waits until empty queue (default) and -1 disables this check.


---

**name**: addressSettings.{ADDRESS}.autoDeleteAddresses

type: Boolean

default: true

xml name: auto-delete-addresses

description: whether or not to delete auto-created addresses when it no longer has any queues


---

**name**: addressSettings.{ADDRESS}.addressFullMessagePolicy

type: AddressFullMessagePolicy

default: 

xml name: address-full-message-policy

description: 


---

**name**: addressSettings.{ADDRESS}.maxSizeBytes

type: long

default: -1

xml name: max-size-bytes

description: the maximum size (in bytes) for an address (-1 means no limits). This is used in PAGING, BLOCK and
                     FAIL policies. Supports byte notation like "K", "Mb", "GB", etc.


---

**name**: addressSettings.{ADDRESS}.redistributionDelay

type: long

default: -1

xml name: redistribution-delay

description: how long (in ms) to wait after the last consumer is closed on a queue before redistributing
                     messages.


---

**name**: addressSettings.{ADDRESS}.defaultDelayBeforeDispatch

type: Long

default: -1

xml name: default-delay-before-dispatch

description: the default delay (in milliseconds) to wait before dispatching if number of consumers before
                     dispatch is not met for queues under the address.


---

**name**: addressSettings.{ADDRESS}.maxSizeMessages

type: long

default: -1

xml name: max-size-messages

description: the maximum number of messages allowed on the address.  This is used in PAGING, BLOCK and FAIL policies. It does not support notations and it is a simple number of messages allowed.


---

**name**: addressSettings.{ADDRESS}.redeliveryMultiplier

type: double

default: 

xml name: redelivery-multiplier

description: 


---

**name**: addressSettings.{ADDRESS}.defaultRingSize

type: long

default: -1

xml name: default-ring-size

description: the default ring-size value for any matching queue which doesn't have `ring-size` explicitly
                     defined


---

**name**: addressSettings.{ADDRESS}.slowConsumerPolicy

type: SlowConsumerPolicy( KILL NOTIFY )

default: NOTIFY

xml name: slow-consumer-policy

description: what happens when a slow consumer is identified


---

**name**: addressSettings.{ADDRESS}.defaultLastValueQueue

type: boolean

default: false

xml name: default-last-value-queue

description: whether to treat the queues under the address as a last value queues by default


---

**name**: addressSettings.{ADDRESS}.redeliveryCollisionAvoidanceFactor

type: double

default: 

xml name: redelivery-collision-avoidance-factor

description: factor by which to modify the redelivery delay slightly to avoid collisions


---

**name**: addressSettings.{ADDRESS}.autoDeleteQueuesDelay

type: long

default: 0

xml name: auto-delete-queues-delay

description: how long to wait (in milliseconds) before deleting auto-created queues after the queue has 0
                     consumers.


---

**name**: addressSettings.{ADDRESS}.autoDeleteAddressesDelay

type: long

default: 0

xml name: auto-delete-addresses-delay

description: how long to wait (in milliseconds) before deleting auto-created addresses after they no longer
                     have any queues


---

**name**: addressSettings.{ADDRESS}.expiryDelay

type: Long

default: -1

xml name: expiry-delay

description: Overrides the expiration time for messages using the default value for expiration time. "-1"
                     disables this setting.


---

**name**: addressSettings.{ADDRESS}.enableMetrics

type: boolean

default: true

xml name: enable-metrics

description: whether or not to enable metrics for metrics plugins on the matching address


---

**name**: addressSettings.{ADDRESS}.sendToDLAOnNoRoute

type: boolean

default: 

xml name: send-to-d-l-a-on-no-route

description: 


---

**name**: addressSettings.{ADDRESS}.slowConsumerThresholdMeasurementUnit

type: SlowConsumerThresholdMeasurementUnit( MESSAGES_PER_SECOND MESSAGES_PER_MINUTE MESSAGES_PER_HOUR MESSAGES_PER_DAY )

default: 

xml name: slow-consumer-threshold-measurement-unit

description: The units used to measure the slow consumer threshold.  Default is messages-per-second.


---

**name**: addressSettings.{ADDRESS}.queuePrefetch

type: int

default: 

xml name: queue-prefetch

description: 


---

**name**: addressSettings.{ADDRESS}.redeliveryDelay

type: long

default: 0

xml name: redelivery-delay

description: the time (in ms) to wait before redelivering a cancelled message.


---

**name**: addressSettings.{ADDRESS}.deadLetterQueueSuffix

type: SimpleString

default: 

xml name: dead-letter-queue-suffix

description: the suffix to use for auto-created dead letter queues


---

**name**: addressSettings.{ADDRESS}.defaultNonDestructive

type: boolean

default: false

xml name: default-non-destructive

description: whether the queue should be non-destructive by default


---

## federationConfigurations
**name**: federationConfigurations.{NAME}.transformerConfigurations

type: FederationTransformerConfiguration

default: 

xml name: transformer

description: optional transformer configuration


---

**name**: federationConfigurations.{NAME}.transformerConfigurations.{NAME}.transformerConfiguration

type: TransformerConfiguration

default: 

xml name: transformer

description: Allows adding a custom transformer to amend the message


---

**name**: federationConfigurations.{NAME}.transformerConfigurations.{NAME}.transformerConfiguration.{NAME}.className

type: String

default: 

xml name: class-name

description: the class name of the Transformer implementation


---

**name**: federationConfigurations.{NAME}.transformerConfigurations.{NAME}.transformerConfiguration.{NAME}.properties

type: Map

default: 

xml name: property

description: A KEY/VALUE pair to set on the transformer, i.e. ...properties.MY_PROPERTY=MY_VALUE


---

**name**: federationConfigurations.{NAME}.queuePolicies

type: FederationQueuePolicyConfiguration

default: 

xml name: queue-policy

description: 


---

**name**: federationConfigurations.{NAME}.queuePolicies.{NAME}.priorityAdjustment

type: Integer

default: 

xml name: priority-adjustment

description: when a consumer attaches its priority is used to make the upstream consumer, but with an adjustment by default -1,
               so that local consumers get load balanced first over remote, this enables this to be configurable should it be wanted/needed.


---

**name**: federationConfigurations.{NAME}.queuePolicies.{NAME}.excludes

type: Matcher

default: 

xml name: exclude

description: A list of Queue matches to exclude


---

**name**: federationConfigurations.{NAME}.queuePolicies.{NAME}.excludes.{NAME}.queueMatch

type: String

default: 

xml name: queue-match

description: A Queue match pattern to apply. If none are present all queues will be matched


---

**name**: federationConfigurations.{NAME}.queuePolicies.{NAME}.transformerRef

type: String

default: 

xml name: transformer-ref

description: The ref name for a transformer (see transformer config) that you may wish to configure to transform the message on federation transfer.


---

**name**: federationConfigurations.{NAME}.queuePolicies.{NAME}.includes

type: Matcher

default: 

xml name: queue-match

description: 


---

**name**: federationConfigurations.{NAME}.queuePolicies.{NAME}.excludes.{NAME}.queueMatch

type: String

default: 

xml name: queue-match

description: A Queue match pattern to apply. If none are present all queues will be matched


---

**name**: federationConfigurations.{NAME}.queuePolicies.{NAME}.includeFederated

type: boolean

default: 

xml name: include-federated

description: by default this is false, we don't federate a federated consumer, this is to avoid issue, where in symmetric
               or any closed loop setup you could end up when no "real" consumers attached with messages flowing round and round endlessly.


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations

type: FederationUpstreamConfiguration

default: 

xml name: upstream

description: 


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations.{NAME}.connectionConfiguration

type: FederationConnectionConfiguration

default: 

xml name: connection-configuration

description: This is the streams connection configuration


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations.{NAME}.connectionConfiguration.priorityAdjustment

type: int

default: 

xml name: priority-adjustment

description: 


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations.{NAME}.connectionConfiguration.retryIntervalMultiplier

type: double

default: 1

xml name: retry-interval-multiplier

description: multiplier to apply to the retry-interval


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations.{NAME}.connectionConfiguration.shareConnection

type: boolean

default: false

xml name: share-connection

description: if there is a downstream and upstream connection configured for the same broker then
                  the same connection will be shared as long as both stream configs set this flag to true


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations.{NAME}.connectionConfiguration.maxRetryInterval

type: long

default: 2000

xml name: max-retry-interval

description: Maximum value for retry-interval


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations.{NAME}.connectionConfiguration.connectionTTL

type: long

default: 

xml name: connection-t-t-l

description: 


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations.{NAME}.connectionConfiguration.circuitBreakerTimeout

type: long

default: 30000

xml name: circuit-breaker-timeout

description: whether this connection supports fail-over


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations.{NAME}.connectionConfiguration.callTimeout

type: long

default: 30000

xml name: call-timeout

description: How long to wait for a reply


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations.{NAME}.connectionConfiguration.staticConnectors

type: List

default: 

xml name: static-connectors

description: A list of connector references configured via connectors


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations.{NAME}.connectionConfiguration.reconnectAttempts

type: int

default: -1

xml name: reconnect-attempts

description: How many attempts should be made to reconnect after failure


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations.{NAME}.connectionConfiguration.password

type: String

default: 

xml name: password

description: password, if unspecified the federated password is used


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations.{NAME}.connectionConfiguration.callFailoverTimeout

type: long

default: -1

xml name: call-failover-timeout

description: How long to wait for a reply if in the middle of a fail-over. -1 means wait forever.


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations.{NAME}.connectionConfiguration.hA

type: boolean

default: 

xml name: h-a

description: 


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations.{NAME}.connectionConfiguration.initialConnectAttempts

type: int

default: -1

xml name: initial-connect-attempts

description: How many attempts should be made to connect initially


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations.{NAME}.connectionConfiguration.retryInterval

type: long

default: 500

xml name: retry-interval

description: period (in ms) between successive retries


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations.{NAME}.connectionConfiguration.clientFailureCheckPeriod

type: long

default: 

xml name: client-failure-check-period

description: 


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations.{NAME}.connectionConfiguration.username

type: String

default: 

xml name: username

description: 


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations.{NAME}.policyRefs

type: Collection

default: 

xml name: policy-refs

description: 


---

**name**: federationConfigurations.{NAME}.upstreamConfigurations.{NAME}.staticConnectors

type: List

default: 

xml name: static-connectors

description: A list of connector references configured via connectors


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations

type: FederationDownstreamConfiguration

default: 

xml name: downstream

description: 


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations.{NAME}.connectionConfiguration

type: FederationConnectionConfiguration

default: 

xml name: connection-configuration

description: This is the streams connection configuration


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations.{NAME}.connectionConfiguration.priorityAdjustment

type: int

default: 

xml name: priority-adjustment

description: 


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations.{NAME}.connectionConfiguration.retryIntervalMultiplier

type: double

default: 1

xml name: retry-interval-multiplier

description: multiplier to apply to the retry-interval


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations.{NAME}.connectionConfiguration.shareConnection

type: boolean

default: false

xml name: share-connection

description: if there is a downstream and upstream connection configured for the same broker then
                  the same connection will be shared as long as both stream configs set this flag to true


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations.{NAME}.connectionConfiguration.maxRetryInterval

type: long

default: 2000

xml name: max-retry-interval

description: Maximum value for retry-interval


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations.{NAME}.connectionConfiguration.connectionTTL

type: long

default: 

xml name: connection-t-t-l

description: 


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations.{NAME}.connectionConfiguration.circuitBreakerTimeout

type: long

default: 30000

xml name: circuit-breaker-timeout

description: whether this connection supports fail-over


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations.{NAME}.connectionConfiguration.callTimeout

type: long

default: 30000

xml name: call-timeout

description: How long to wait for a reply


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations.{NAME}.connectionConfiguration.staticConnectors

type: List

default: 

xml name: static-connectors

description: A list of connector references configured via connectors


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations.{NAME}.connectionConfiguration.reconnectAttempts

type: int

default: -1

xml name: reconnect-attempts

description: How many attempts should be made to reconnect after failure


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations.{NAME}.connectionConfiguration.password

type: String

default: 

xml name: password

description: password, if unspecified the federated password is used


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations.{NAME}.connectionConfiguration.callFailoverTimeout

type: long

default: -1

xml name: call-failover-timeout

description: How long to wait for a reply if in the middle of a fail-over. -1 means wait forever.


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations.{NAME}.connectionConfiguration.hA

type: boolean

default: 

xml name: h-a

description: 


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations.{NAME}.connectionConfiguration.initialConnectAttempts

type: int

default: -1

xml name: initial-connect-attempts

description: How many attempts should be made to connect initially


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations.{NAME}.connectionConfiguration.retryInterval

type: long

default: 500

xml name: retry-interval

description: period (in ms) between successive retries


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations.{NAME}.connectionConfiguration.clientFailureCheckPeriod

type: long

default: 

xml name: client-failure-check-period

description: 


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations.{NAME}.connectionConfiguration.username

type: String

default: 

xml name: username

description: 


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations.{NAME}.policyRefs

type: Collection

default: 

xml name: policy-refs

description: 


---

**name**: federationConfigurations.{NAME}.downstreamConfigurations.{NAME}.staticConnectors

type: List

default: 

xml name: static-connectors

description: A list of connector references configured via connectors


---

**name**: federationConfigurations.{NAME}.federationPolicys

type: FederationPolicy

default: 

xml name: policy-set

description: 


---

**name**: federationConfigurations.{NAME}.addressPolicies

type: FederationAddressPolicyConfiguration

default: 

xml name: address-policy

description: 


---

**name**: federationConfigurations.{NAME}.addressPolicies.{NAME}.includes.{NAME}.addressMatch

type: Matcher

default: 

xml name: include

description: 


---

**name**: federationConfigurations.{NAME}.addressPolicies.{NAME}.maxHops

type: int

default: 

xml name: max-hops

description: //todo


---

**name**: federationConfigurations.{NAME}.addressPolicies.{NAME}.excludes.{NAME}.addressMatch

type: Matcher

default: 

xml name: include

description: 


---

## clusterConfigurations
**name**: clusterConfigurations.{NAME}.retryIntervalMultiplier

type: double

default: 1

xml name: retry-interval-multiplier

description: multiplier to apply to the retry-interval


---

**name**: clusterConfigurations.{NAME}.maxRetryInterval

type: long

default: 2000

xml name: max-retry-interval

description: Maximum value for retry-interval


---

**name**: clusterConfigurations.{NAME}.address

type: String

default: 

xml name: address

description: name of the address this cluster connection applies to


---

**name**: clusterConfigurations.{NAME}.maxHops

type: int

default: 1

xml name: max-hops

description: maximum number of hops cluster topology is propagated


---

**name**: clusterConfigurations.{NAME}.connectionTTL

type: long

default: 60000

xml name: connection-ttl

description: how long to keep a connection alive in the absence of any data arriving from the client


---

**name**: clusterConfigurations.{NAME}.clusterNotificationInterval

type: long

default: 1000

xml name: notification-interval

description: how often the cluster connection will notify the cluster of its existence right after joining the
                  cluster


---

**name**: clusterConfigurations.{NAME}.confirmationWindowSize

type: int

default: 1048576

xml name: confirmation-window-size

description: The size (in bytes) of the window used for confirming data from the server connected to. Supports
                  byte notation like "K", "Mb", "GB", etc.


---

**name**: clusterConfigurations.{NAME}.callTimeout

type: long

default: 30000

xml name: call-timeout

description: How long to wait for a reply


---

**name**: clusterConfigurations.{NAME}.staticConnectors

type: List

default: 

xml name: static-connectors

description: A list of connectors references names


---

**name**: clusterConfigurations.{NAME}.clusterNotificationAttempts

type: int

default: 2

xml name: notification-attempts

description: how many times this cluster connection will notify the cluster of its existence right after joining
                  the cluster


---

**name**: clusterConfigurations.{NAME}.allowDirectConnectionsOnly

type: boolean

default: false

xml name: allow-direct-connections-only

description: restricts cluster connections to the listed connector-ref's


---

**name**: clusterConfigurations.{NAME}.reconnectAttempts

type: int

default: -1

xml name: reconnect-attempts

description: How many attempts should be made to reconnect after failure


---

**name**: clusterConfigurations.{NAME}.duplicateDetection

type: boolean

default: true

xml name: use-duplicate-detection

description: should duplicate detection headers be inserted in forwarded messages?


---

**name**: clusterConfigurations.{NAME}.callFailoverTimeout

type: long

default: -1

xml name: call-failover-timeout

description: How long to wait for a reply if in the middle of a fail-over. -1 means wait forever.


---

**name**: clusterConfigurations.{NAME}.messageLoadBalancingType

type: MessageLoadBalancingType( OFF STRICT ON_DEMAND OFF_WITH_REDISTRIBUTION )

default: 

xml name: message-load-balancing-type

description: 


---

**name**: clusterConfigurations.{NAME}.initialConnectAttempts

type: int

default: -1

xml name: initial-connect-attempts

description: How many attempts should be made to connect initially


---

**name**: clusterConfigurations.{NAME}.connectorName

type: String

default: 

xml name: connector-ref

description: Name of the connector reference to use.


---

**name**: clusterConfigurations.{NAME}.retryInterval

type: long

default: 500

xml name: retry-interval

description: period (in ms) between successive retries


---

**name**: clusterConfigurations.{NAME}.producerWindowSize

type: int

default: 1048576

xml name: producer-window-size

description: Producer flow control. Supports byte notation like "K", "Mb", "GB", etc.


---

**name**: clusterConfigurations.{NAME}.clientFailureCheckPeriod

type: long

default: 

xml name: client-failure-check-period

description: 


---

**name**: clusterConfigurations.{NAME}.discoveryGroupName

type: String

default: 

xml name: discovery-group-name

description: name of discovery group used by this cluster-connection


---

**name**: clusterConfigurations.{NAME}.minLargeMessageSize

type: int

default: 

xml name: min-large-message-size

description: Messages larger than this are considered large-messages. Supports byte notation like
                  "K", "Mb", "GB", etc.


---

## connectionRouters
**name**: connectionRouters.{NAME}.cacheConfiguration

type: CacheConfiguration

default: 

xml name: cache

description: This controls how often a cache removes its entries and if they are persisted.


---

**name**: connectionRouters.{NAME}.cacheConfiguration.persisted

type: boolean

default: false

xml name: persisted

description: true means that the cache entries are persisted


---

**name**: connectionRouters.{NAME}.cacheConfiguration.timeout

type: int

default: -1

xml name: timeout

description: the timeout (in milliseconds) before removing cache entries


---

**name**: connectionRouters.{NAME}.keyFilter

type: String

default: 

xml name: key-filter

description: the filter for the target key


---

**name**: connectionRouters.{NAME}.keyType

type: KeyType( CLIENT_ID SNI_HOST SOURCE_IP USER_NAME ROLE_NAME )

default: 

xml name: key-type

description: the optional target key


---

**name**: connectionRouters.{NAME}.localTargetFilter

type: String

default: 

xml name: local-target-filter

description: the filter to get the local target


---

**name**: connectionRouters.{NAME}.poolConfiguration

type: PoolConfiguration

default: 

xml name: pool

description: the pool configuration


---

**name**: connectionRouters.{NAME}.poolConfiguration.quorumTimeout

type: int

default: 3000

xml name: quorum-timeout

description: the timeout (in milliseconds) used to get the minimum number of ready targets


---

**name**: connectionRouters.{NAME}.poolConfiguration.password

type: String

default: 

xml name: password

description: the password to access the targets


---

**name**: connectionRouters.{NAME}.poolConfiguration.localTargetEnabled

type: boolean

default: false

xml name: local-target-enabled

description: true means that the local target is enabled


---

**name**: connectionRouters.{NAME}.poolConfiguration.checkPeriod

type: int

default: 5000

xml name: check-period

description: the period (in milliseconds) used to check if a target is ready


---

**name**: connectionRouters.{NAME}.poolConfiguration.quorumSize

type: int

default: 1

xml name: quorum-size

description: the minimum number of ready targets


---

**name**: connectionRouters.{NAME}.poolConfiguration.staticConnectors

type: List

default: 

xml name: static-connectors

description: A list of connector references configured via connectors


---

**name**: connectionRouters.{NAME}.poolConfiguration.discoveryGroupName

type: String

default: 

xml name: discovery-group-name

description: name of discovery group used by this bridge


---

**name**: connectionRouters.{NAME}.poolConfiguration.clusterConnection

type: String

default: 

xml name: cluster-connection

description: the name of a cluster connection


---

**name**: connectionRouters.{NAME}.poolConfiguration.username

type: String

default: 

xml name: username

description: the username to access the targets


---

**name**: connectionRouters.{NAME}.policyConfiguration

type: NamedPropertyConfiguration

default: 

xml name: policy-configuration

description: 


---

**name**: connectionRouters.{NAME}..properties.{PROPERTY}

type: Properties

default: 

xml name: property

description: A set of Key value pairs specific to each named property, see above description


---

