# begin scram connection
use MongoDB;

my $client = MongoDB->connect(
  'mongodb+srv://<username>:<password>@<cluster-url>/test?retryWrites=true&w=majority'
);
my $db = $client->get_database( 'test' );
# end scram connection