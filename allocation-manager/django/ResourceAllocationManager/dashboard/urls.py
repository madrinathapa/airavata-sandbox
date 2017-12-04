from django.conf.urls import url
from . import views

app_name ='dashboard'

urlpatterns = [
    # /dashboard/
    # url(r'^$', views.index, name='index'),
    url(r'^$', views.IndexView.as_view(), name='index'),


    url(r'^register/$', views.UserFormView.as_view(), name='register'),

    # /dashboard/712/
    # url(r'^(?P<request_id>[0-9]+)/$', views.detail, name='detail'),
    url(r'^(?P<pk>[0-9]+)/$', views.DetailView.as_view(), name='detail'),


    # /dashboard/request/add
    url(r'^request/add/$', views.RequestCreate.as_view(), name='request-add'),

    # /dashboard/request/2/
    url(r'^request/(?P<pk>[0-9]+)/$', views.RequestUpdate.as_view(), name='request-update'),

    # /dashboard/request/2/delete/
    url(r'^request/(?P<pk>[0-9]+)/delete/$', views.RequestDelete.as_view(), name='request-delete'),
]