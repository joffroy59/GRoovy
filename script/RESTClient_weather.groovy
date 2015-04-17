@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.5.1')
import groovyx.net.http.RESTClient

client = new RESTClient( 'http://api.openweathermap.org/data/2.5/' )

println "|=Project|=Description|=Use Wiki?|=Use Issues?"
def resp = client.get( path : 'weather?lat=35&lon=139' )

assert resp.status == 200  // HTTP response code; 404 means not found, etc.
println resp.getData()
