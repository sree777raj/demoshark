apiVersion: apps/v1
kind: Deployment
metadata:
  name: ridev-container
  labels:
    app: ridev
spec:
  replicas: 1
  selector:
    matchLabels:
      app: ridev
  template:
    metadata:
      labels:
        app: ridev
    spec:
      containers:
      - name: ridev
        image: gcr.io/GOOGLE_CLOUD_PROJECT/tomcat:COMMIT_SHA
        ports:
        - containerPort: 8080
        volumeMounts:
        - mountPath: "/usr/local/tomcat/dataFiles"
          name: ri-volume
      volumes:
      - name: ri-volume
        persistentVolumeClaim:
          claimName: fdx-ri-dev-pvc
